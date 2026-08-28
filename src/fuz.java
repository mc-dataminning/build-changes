import java.util.UUID;

public class fuz extends buh {
   private static final long j = 100L;
   protected float h;
   protected long i;

   public fuz(UUID $$0, xa $$1, float $$2, buh.a $$3, buh.b $$4, boolean $$5, boolean $$6, boolean $$7) {
      super($$0, $$1, $$3, $$4);
      this.h = $$2;
      this.b = $$2;
      this.i = ag.c();
      this.a($$5);
      this.b($$6);
      this.c($$7);
   }

   @Override
   public void a(float $$0) {
      this.b = this.k();
      this.h = $$0;
      this.i = ag.c();
   }

   @Override
   public float k() {
      long $$0 = ag.c() - this.i;
      float $$1 = azo.a((float)$$0 / 100.0F, 0.0F, 1.0F);
      return azo.h($$1, this.b, this.h);
   }
}
