public interface hnj {
   hkq a(hmx var1, hnb var2);

   hkq a(String var1, hnb var2);

   default hkq a(gti $$0, String $$1, hnb $$2) {
      hmx $$3 = $$0.a($$1);
      return $$3 != null ? this.a($$3, $$2) : this.a($$1, $$2);
   }
}
