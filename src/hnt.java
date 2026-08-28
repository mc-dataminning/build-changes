public interface hnt {
   hla a(hnh var1, hnl var2);

   hla a(String var1, hnl var2);

   default hla a(gtv $$0, String $$1, hnl $$2) {
      hnh $$3 = $$0.a($$1);
      return $$3 != null ? this.a($$3, $$2) : this.a($$1, $$2);
   }
}
