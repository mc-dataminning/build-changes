public class guc<T extends bvj & cqm> extends gro<T, gzv> {
   private final gsn a;
   private final float b;
   private final boolean h;

   public guc(grp.a $$0, float $$1, boolean $$2) {
      super($$0);
      this.a = $$0.b();
      this.b = $$1;
      this.h = $$2;
   }

   public guc(grp.a $$0) {
      this($$0, 1.0F, false);
   }

   @Override
   protected int a(T $$0, jh $$1) {
      return this.h ? 15 : super.a($$0, $$1);
   }

   public void a(gzv $$0, fgr $$1, glk $$2, int $$3) {
      $$1.a();
      $$1.b(this.b, this.b, this.b);
      $$1.a(this.e.b());
      if ($$0.a != null) {
         this.a.a($$0.b, cxm.h, false, $$1, $$2, $$3, hbb.d, $$0.a);
      }

      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gzv a() {
      return new gzv();
   }

   public void a(T $$0, gzv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      cxo $$3 = $$0.l();
      $$1.a = !$$3.f() ? this.a.a($$3, $$0.dW(), null, $$0.ar()) : null;
      $$1.b = $$3.v();
   }
}
