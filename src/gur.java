public class gur<T extends bul & cpn> extends gsd<T, han> {
   private final hbm a;
   private final float b;
   private final boolean h;

   public gur(gse.a $$0, float $$1, boolean $$2) {
      super($$0);
      this.a = $$0.b();
      this.b = $$1;
      this.h = $$2;
   }

   public gur(gse.a $$0) {
      this($$0, 1.0F, false);
   }

   @Override
   protected int a(T $$0, ji $$1) {
      return this.h ? 15 : super.a($$0, $$1);
   }

   public void a(han $$0, ffu $$1, gly $$2, int $$3) {
      $$1.a();
      $$1.b(this.b, this.b, this.b);
      $$1.a(this.e.b());
      $$0.a.a($$1, $$2, $$3, hei.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public han a() {
      return new han();
   }

   public void a(T $$0, han $$1, float $$2) {
      super.a($$0, $$1, $$2);
      this.a.a($$1.a, $$0.l(), cwn.h, $$0);
   }
}
