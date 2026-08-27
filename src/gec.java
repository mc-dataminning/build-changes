import javax.annotation.Nullable;

public class gec implements cyx {
   private final int c;
   private final int d;
   protected final geb[][] a;
   protected final czu b;

   gec(czu $$0, int $$1, int $$2, geb[][] $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.a = $$3;
   }

   @Override
   public dpy a_(im $$0) {
      int $$1 = jo.a($$0.u()) - this.c;
      int $$2 = jo.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0);
   }

   @Override
   public elr b_(im $$0) {
      int $$1 = jo.a($$0.u()) - this.c;
      int $$2 = jo.a($$0.w()) - this.d;
      return this.a[$$1][$$2].b($$0).u();
   }

   @Override
   public float a(ir $$0, boolean $$1) {
      return this.b.a($$0, $$1);
   }

   @Override
   public elg y_() {
      return this.b.y_();
   }

   @Nullable
   @Override
   public dnd c_(im $$0) {
      int $$1 = jo.a($$0.u()) - this.c;
      int $$2 = jo.a($$0.w()) - this.d;
      return this.a[$$1][$$2].a($$0);
   }

   @Override
   public int a(im $$0, czf $$1) {
      return this.b.a($$0, $$1);
   }

   @Override
   public int I_() {
      return this.b.I_();
   }

   @Override
   public int J_() {
      return this.b.J_();
   }
}
