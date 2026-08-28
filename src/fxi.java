import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Stream;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public final class fxi {
   public static final float a = 1.0F;
   public float b;
   public float c;
   public float d;
   public float e;
   public float f;
   public float g;
   public float h = 1.0F;
   public float i = 1.0F;
   public float j = 1.0F;
   public boolean k = true;
   public boolean l;
   private final List<fxi.a> m;
   private final Map<String, fxi> n;
   private fxk o = fxk.a;

   public fxi(List<fxi.a> $$0, Map<String, fxi> $$1) {
      this.m = $$0;
      this.n = $$1;
   }

   public fxk a() {
      return fxk.a(this.b, this.c, this.d, this.e, this.f, this.g);
   }

   public fxk b() {
      return this.o;
   }

   public void a(fxk $$0) {
      this.o = $$0;
   }

   public void c() {
      this.b(this.o);
   }

   public void b(fxk $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = 1.0F;
      this.i = 1.0F;
      this.j = 1.0F;
   }

   public void a(fxi $$0) {
      this.h = $$0.h;
      this.i = $$0.i;
      this.j = $$0.j;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
   }

   public boolean a(String $$0) {
      return this.n.containsKey($$0);
   }

   public fxi b(String $$0) {
      fxi $$1 = this.n.get($$0);
      if ($$1 == null) {
         throw new NoSuchElementException("Can't find part " + $$0);
      } else {
         return $$1;
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public void b(float $$0, float $$1, float $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   public void a(fag $$0, fak $$1, int $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   public void a(fag $$0, fak $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      if (this.k) {
         if (!this.m.isEmpty() || !this.n.isEmpty()) {
            $$0.a();
            this.a($$0);
            if (!this.l) {
               this.a($$0.c(), $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            }

            for (fxi $$8 : this.n.values()) {
               $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
            }

            $$0.b();
         }
      }
   }

   public void a(fag $$0, fxi.d $$1) {
      this.a($$0, $$1, "");
   }

   private void a(fag $$0, fxi.d $$1, String $$2) {
      if (!this.m.isEmpty() || !this.n.isEmpty()) {
         $$0.a();
         this.a($$0);
         fag.a $$3 = $$0.c();

         for (int $$4 = 0; $$4 < this.m.size(); $$4++) {
            $$1.visit($$3, $$2, $$4, this.m.get($$4));
         }

         String $$5 = $$2 + "/";
         this.n.forEach(($$3x, $$4) -> $$4.a($$0, $$1, $$5 + $$3x));
         $$0.b();
      }
   }

   public void a(fag $$0) {
      $$0.a(this.b / 16.0F, this.c / 16.0F, this.d / 16.0F);
      if (this.e != 0.0F || this.f != 0.0F || this.g != 0.0F) {
         $$0.a(new Quaternionf().rotationZYX(this.g, this.f, this.e));
      }

      if (this.h != 1.0F || this.i != 1.0F || this.j != 1.0F) {
         $$0.b(this.h, this.i, this.j);
      }
   }

   private void a(fag.a $$0, fak $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      for (fxi.a $$8 : this.m) {
         $$8.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   public fxi.a a(aym $$0) {
      return this.m.get($$0.a(this.m.size()));
   }

   public boolean d() {
      return this.m.isEmpty();
   }

   public void a(Vector3f $$0) {
      this.b = this.b + $$0.x();
      this.c = this.c + $$0.y();
      this.d = this.d + $$0.z();
   }

   public void b(Vector3f $$0) {
      this.e = this.e + $$0.x();
      this.f = this.f + $$0.y();
      this.g = this.g + $$0.z();
   }

   public void c(Vector3f $$0) {
      this.h = this.h + $$0.x();
      this.i = this.i + $$0.y();
      this.j = this.j + $$0.z();
   }

   public Stream<fxi> e() {
      return Stream.concat(Stream.of(this), this.n.values().stream().flatMap(fxi::e));
   }

   public static class a {
      private final fxi.b[] g;
      public final float a;
      public final float b;
      public final float c;
      public final float d;
      public final float e;
      public final float f;

      public a(
         int $$0,
         int $$1,
         float $$2,
         float $$3,
         float $$4,
         float $$5,
         float $$6,
         float $$7,
         float $$8,
         float $$9,
         float $$10,
         boolean $$11,
         float $$12,
         float $$13,
         Set<jf> $$14
      ) {
         this.a = $$2;
         this.b = $$3;
         this.c = $$4;
         this.d = $$2 + $$5;
         this.e = $$3 + $$6;
         this.f = $$4 + $$7;
         this.g = new fxi.b[$$14.size()];
         float $$15 = $$2 + $$5;
         float $$16 = $$3 + $$6;
         float $$17 = $$4 + $$7;
         $$2 -= $$8;
         $$3 -= $$9;
         $$4 -= $$10;
         $$15 += $$8;
         $$16 += $$9;
         $$17 += $$10;
         if ($$11) {
            float $$18 = $$15;
            $$15 = $$2;
            $$2 = $$18;
         }

         fxi.c $$19 = new fxi.c($$2, $$3, $$4, 0.0F, 0.0F);
         fxi.c $$20 = new fxi.c($$15, $$3, $$4, 0.0F, 8.0F);
         fxi.c $$21 = new fxi.c($$15, $$16, $$4, 8.0F, 8.0F);
         fxi.c $$22 = new fxi.c($$2, $$16, $$4, 8.0F, 0.0F);
         fxi.c $$23 = new fxi.c($$2, $$3, $$17, 0.0F, 0.0F);
         fxi.c $$24 = new fxi.c($$15, $$3, $$17, 0.0F, 8.0F);
         fxi.c $$25 = new fxi.c($$15, $$16, $$17, 8.0F, 8.0F);
         fxi.c $$26 = new fxi.c($$2, $$16, $$17, 8.0F, 0.0F);
         float $$27 = (float)$$0;
         float $$28 = (float)$$0 + $$7;
         float $$29 = (float)$$0 + $$7 + $$5;
         float $$30 = (float)$$0 + $$7 + $$5 + $$5;
         float $$31 = (float)$$0 + $$7 + $$5 + $$7;
         float $$32 = (float)$$0 + $$7 + $$5 + $$7 + $$5;
         float $$33 = (float)$$1;
         float $$34 = (float)$$1 + $$7;
         float $$35 = (float)$$1 + $$7 + $$6;
         int $$36 = 0;
         if ($$14.contains(jf.a)) {
            this.g[$$36++] = new fxi.b(new fxi.c[]{$$24, $$23, $$19, $$20}, $$28, $$33, $$29, $$34, $$12, $$13, $$11, jf.a);
         }

         if ($$14.contains(jf.b)) {
            this.g[$$36++] = new fxi.b(new fxi.c[]{$$21, $$22, $$26, $$25}, $$29, $$34, $$30, $$33, $$12, $$13, $$11, jf.b);
         }

         if ($$14.contains(jf.e)) {
            this.g[$$36++] = new fxi.b(new fxi.c[]{$$19, $$23, $$26, $$22}, $$27, $$34, $$28, $$35, $$12, $$13, $$11, jf.e);
         }

         if ($$14.contains(jf.c)) {
            this.g[$$36++] = new fxi.b(new fxi.c[]{$$20, $$19, $$22, $$21}, $$28, $$34, $$29, $$35, $$12, $$13, $$11, jf.c);
         }

         if ($$14.contains(jf.f)) {
            this.g[$$36++] = new fxi.b(new fxi.c[]{$$24, $$20, $$21, $$25}, $$29, $$34, $$31, $$35, $$12, $$13, $$11, jf.f);
         }

         if ($$14.contains(jf.d)) {
            this.g[$$36] = new fxi.b(new fxi.c[]{$$23, $$24, $$25, $$26}, $$31, $$34, $$32, $$35, $$12, $$13, $$11, jf.d);
         }
      }

      public void a(fag.a $$0, fak $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
         Matrix4f $$8 = $$0.a();
         Vector3f $$9 = new Vector3f();

         for (fxi.b $$10 : this.g) {
            Vector3f $$11 = $$0.a($$10.b, $$9);
            float $$12 = $$11.x();
            float $$13 = $$11.y();
            float $$14 = $$11.z();

            for (fxi.c $$15 : $$10.a) {
               float $$16 = $$15.a.x() / 16.0F;
               float $$17 = $$15.a.y() / 16.0F;
               float $$18 = $$15.a.z() / 16.0F;
               Vector3f $$19 = $$8.transformPosition($$16, $$17, $$18, $$9);
               $$1.a($$19.x(), $$19.y(), $$19.z(), $$4, $$5, $$6, $$7, $$15.b, $$15.c, $$3, $$2, $$12, $$13, $$14);
            }
         }
      }
   }

   static class b {
      public final fxi.c[] a;
      public final Vector3f b;

      public b(fxi.c[] $$0, float $$1, float $$2, float $$3, float $$4, float $$5, float $$6, boolean $$7, jf $$8) {
         this.a = $$0;
         float $$9 = 0.0F / $$5;
         float $$10 = 0.0F / $$6;
         $$0[0] = $$0[0].a($$3 / $$5 - $$9, $$2 / $$6 + $$10);
         $$0[1] = $$0[1].a($$1 / $$5 + $$9, $$2 / $$6 + $$10);
         $$0[2] = $$0[2].a($$1 / $$5 + $$9, $$4 / $$6 - $$10);
         $$0[3] = $$0[3].a($$3 / $$5 - $$9, $$4 / $$6 - $$10);
         if ($$7) {
            int $$11 = $$0.length;

            for (int $$12 = 0; $$12 < $$11 / 2; $$12++) {
               fxi.c $$13 = $$0[$$12];
               $$0[$$12] = $$0[$$11 - 1 - $$12];
               $$0[$$11 - 1 - $$12] = $$13;
            }
         }

         this.b = $$8.m();
         if ($$7) {
            this.b.mul(-1.0F, 1.0F, 1.0F);
         }
      }
   }

   static class c {
      public final Vector3f a;
      public final float b;
      public final float c;

      public c(float $$0, float $$1, float $$2, float $$3, float $$4) {
         this(new Vector3f($$0, $$1, $$2), $$3, $$4);
      }

      public fxi.c a(float $$0, float $$1) {
         return new fxi.c(this.a, $$0, $$1);
      }

      public c(Vector3f $$0, float $$1, float $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }
   }

   @FunctionalInterface
   public interface d {
      void visit(fag.a var1, String var2, int var3, fxi.a var4);
   }
}
