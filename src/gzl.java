public class gzl<T extends bwi & cse> extends gwx<T, hfh> {
   private final hgg a;
   private final float g;
   private final boolean h;

   public gzl(gwy.a $$0, float $$1, boolean $$2) {
      super($$0);
      this.a = $$0.b();
      this.g = $$1;
      this.h = $$2;
   }

   public gzl(gwy.a $$0) {
      this($$0, 1.0F, false);
   }

   @Override
   protected int a(T $$0, iv $$1) {
      return this.h ? 15 : super.a($$0, $$1);
   }

   public void a(hfh $$0, fkd $$1, gqr $$2, int $$3) {
      $$1.a();
      $$1.b(this.g, this.g, this.g);
      $$1.a(this.d.b());
      $$0.a.a($$1, $$2, $$3, hjg.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hfh a() {
      return new hfh();
   }

   public void a(T $$0, hfh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      this.a.a($$1.a, $$0.f(), czl.h, $$0);
   }
}
