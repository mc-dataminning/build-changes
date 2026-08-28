public class gva<T extends ckw> extends gua<T, hbl, gex> {
   private final ale a;

   public gva(gvk.a $$0, gva.a $$1) {
      super($$0, new gex($$0.a($$1.d)), new gex($$0.a($$1.e)));
      this.a = $$1.c;
      this.a(new haa<>(this, $$0.h(), $$1.f, $$0x -> $$0x.b, new gfe($$0.a($$1.g)), new gfe($$0.a($$1.h))));
   }

   public ale a(hbl $$0) {
      return this.a;
   }

   public hbl a() {
      return new hbl();
   }

   public void a(T $$0, hbl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }

   public static enum a {
      a(ale.b("textures/entity/horse/donkey.png"), gif.av, gif.aw, hkf.d.k, gif.ax, gif.ay),
      b(ale.b("textures/entity/horse/mule.png"), gif.bL, gif.bM, hkf.d.l, gif.bN, gif.bO);

      final ale c;
      final gie d;
      final gie e;
      final hkf.d f;
      final gie g;
      final gie h;

      private a(final ale $$0, final gie $$1, final gie $$2, final hkf.d $$3, final gie $$4, final gie $$5) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
         this.g = $$4;
         this.h = $$5;
      }
   }
}
