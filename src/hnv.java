public interface hnv {
   hlc a(hnj var1, hnn var2);

   hlc a(String var1, hnn var2);

   default hlc a(gtx $$0, String $$1, hnn $$2) {
      hnj $$3 = $$0.a($$1);
      return $$3 != null ? this.a($$3, $$2) : this.a($$1, $$2);
   }
}
