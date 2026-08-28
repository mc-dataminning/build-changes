public class gup<T extends buk & cpn> extends gsb<T, hal> {
   private final hbj a;
   private final float b;
   private final boolean h;

   public gup(gsc.a $$0, float $$1, boolean $$2) {
      super($$0);
      this.a = $$0.b();
      this.b = $$1;
      this.h = $$2;
   }

   public gup(gsc.a $$0) {
      this($$0, 1.0F, false);
   }

   @Override
   protected int a(T $$0, ji $$1) {
      return this.h ? 15 : super.a($$0, $$1);
   }

   public void a(hal $$0, ffu $$1, glx $$2, int $$3) {
      $$1.a();
      $$1.b(this.b, this.b, this.b);
      $$1.a(this.e.b());
      $$0.a.a($$1, $$2, $$3, hea.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hal a() {
      return new hal();
   }

   public void a(T $$0, hal $$1, float $$2) {
      super.a($$0, $$1, $$2);
      this.a.a($$1.a, $$0.l(), cwn.h, $$0);
   }
}
