public class gwt<S extends gzj & haa, M extends gca<? super S>> extends gws<S, M> {
   private final akv a;
   private final M b;
   private final M c;

   public gwt(gua<S, M> $$0, M $$1, M $$2, akv $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.a = $$3;
   }

   public gwt(gua<S, M> $$0, M $$1, akv $$2) {
      this($$0, $$1, $$1, $$2);
   }

   public void a(fft $$0, glx $$1, int $$2, S $$3, float $$4, float $$5) {
      if ($$3.a()) {
         M $$6 = $$3.aj ? this.c : this.b;
         $$6.a($$3);
         ffx $$7 = $$1.getBuffer(gmh.g(this.a));
         $$6.a($$0, $$7, $$2, heh.d);
      }
   }
}
