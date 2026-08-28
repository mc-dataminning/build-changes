import org.joml.Matrix4f;

public class fuy {
   public static final float a = 0.001F;
   private final fuw b;
   private final float c;
   private final float d;
   private final float e;
   private final float f;
   private final float g;
   private final float h;
   private final float i;
   private final float j;

   public fuy(fuw $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, float $$7, float $$8) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
      this.j = $$8;
   }

   public void a(fuy.b $$0, Matrix4f $$1, fjg $$2, int $$3) {
      xv $$4 = $$0.f();
      boolean $$5 = $$4.d();
      float $$6 = $$0.a();
      float $$7 = $$0.b();
      int $$8 = $$0.c();
      int $$9 = $$0.d();
      boolean $$10 = $$4.c();
      if ($$0.i()) {
         this.a($$5, $$6 + $$0.h(), $$7 + $$0.h(), $$1, $$2, $$9, $$10, $$3);
         this.a($$5, $$6, $$7, 0.03F, $$1, $$2, $$8, $$10, $$3);
      } else {
         this.a($$5, $$6, $$7, $$1, $$2, $$8, $$10, $$3);
      }

      if ($$10) {
         if ($$0.i()) {
            this.a($$5, $$6 + $$0.g() + $$0.h(), $$7 + $$0.h(), 0.001F, $$1, $$2, $$9, true, $$3);
            this.a($$5, $$6 + $$0.g(), $$7, 0.03F, $$1, $$2, $$8, true, $$3);
         } else {
            this.a($$5, $$6 + $$0.g(), $$7, $$1, $$2, $$8, true, $$3);
         }
      }
   }

   private void a(boolean $$0, float $$1, float $$2, Matrix4f $$3, fjg $$4, int $$5, boolean $$6, int $$7) {
      this.a($$0, $$1, $$2, 0.0F, $$3, $$4, $$5, $$6, $$7);
   }

   private void a(boolean $$0, float $$1, float $$2, float $$3, Matrix4f $$4, fjg $$5, int $$6, boolean $$7, int $$8) {
      float $$9 = $$1 + this.g;
      float $$10 = $$1 + this.h;
      float $$11 = $$2 + this.i;
      float $$12 = $$2 + this.j;
      float $$13 = $$0 ? 1.0F - 0.25F * this.i : 0.0F;
      float $$14 = $$0 ? 1.0F - 0.25F * this.j : 0.0F;
      float $$15 = $$7 ? 0.1F : 0.0F;
      $$5.a($$4, $$9 + $$13 - $$15, $$11 - $$15, $$3).a($$6).a(this.c, this.e).c($$8);
      $$5.a($$4, $$9 + $$14 - $$15, $$12 + $$15, $$3).a($$6).a(this.c, this.f).c($$8);
      $$5.a($$4, $$10 + $$14 + $$15, $$12 + $$15, $$3).a($$6).a(this.d, this.f).c($$8);
      $$5.a($$4, $$10 + $$13 + $$15, $$11 - $$15, $$3).a($$6).a(this.d, this.e).c($$8);
   }

   public void a(fuy.a $$0, Matrix4f $$1, fjg $$2, int $$3) {
      if ($$0.i()) {
         this.a($$0, $$0.h(), 0.0F, $$0.g(), $$2, $$3, $$1);
         this.a($$0, 0.0F, 0.03F, $$0.f, $$2, $$3, $$1);
      } else {
         this.a($$0, 0.0F, 0.0F, $$0.f, $$2, $$3, $$1);
      }
   }

   private void a(fuy.a $$0, float $$1, float $$2, int $$3, fjg $$4, int $$5, Matrix4f $$6) {
      $$4.a($$6, $$0.a + $$1, $$0.b + $$1, $$0.e + $$2).a($$3).a(this.c, this.e).c($$5);
      $$4.a($$6, $$0.c + $$1, $$0.b + $$1, $$0.e + $$2).a($$3).a(this.c, this.f).c($$5);
      $$4.a($$6, $$0.c + $$1, $$0.d + $$1, $$0.e + $$2).a($$3).a(this.d, this.f).c($$5);
      $$4.a($$6, $$0.a + $$1, $$0.d + $$1, $$0.e + $$2).a($$3).a(this.d, this.e).c($$5);
   }

   public gqc a(frm.a $$0) {
      return this.b.a($$0);
   }

   public static record a(float a, float b, float c, float d, float e, int f, int g, float h) {

      public a(float $$0, float $$1, float $$2, float $$3, float $$4, int $$5) {
         this($$0, $$1, $$2, $$3, $$4, $$5, 0, 0.0F);
      }

      boolean i() {
         return this.g() != 0;
      }
   }

   public static record b(float a, float b, int c, int d, fuy e, xv f, float g, float h) {
      boolean i() {
         return this.d() != 0;
      }
   }
}
