package com.sksamuel.elastic4s.query

import org.elasticsearch.index.query.{QueryBuilders, TermsQueryBuilder}

case class FloatTermsQueryDefinition(field: String, values: Seq[Float]) extends GenericTermsQueryDefinition {
  val builder: TermsQueryBuilder = QueryBuilders.termsQuery(field, values: _*)
}
