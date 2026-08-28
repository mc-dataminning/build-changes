import java.util.stream.IntStream;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class fya extends fxi {
   protected final dyb a;
   private dyc c;
   private final String[] d;
   private final boolean s;
   protected final ebc b;
   private int u;
   private int v;
   @Nullable
   private ful w;

   public fya(dyb $$0, boolean $$1, boolean $$2) {
      this($$0, $$1, $$2, ww.c("sign.edit"));
   }

   public fya(dyb $$0, boolean $$1, boolean $$2, ww $$3) {
      super($$3);
      this.a = $$0;
      this.c = $$0.a($$1);
      this.s = $$1;
      this.b = dta.a($$0.m().b());
      this.d = IntStream.range(0, 4).mapToObj($$1x -> this.c.a($$1x, $$2)).map(ww::getString).toArray(String[]::new);
   }

   @Override
   protected void aN_() {
      this.c(frq.a(wv.d, $$0 -> this.F()).a(this.n / 2 - 100, this.o / 4 + 144, 200, 20).a());
      this.w = new ful(() -> this.d[this.v], this::a, ful.a(this.m), ful.c(this.m), $$0 -> this.m.h.b($$0) <= this.a.c());
   }

   @Override
   public void e() {
      this.u++;
      if (!this.E()) {
         this.F();
      }
   }

   private boolean E() {
      return this.m != null && this.m.t != null && !this.a.n() && !this.a.b(this.m.t.cG());
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 265) {
         this.v = this.v - 1 & 3;
         this.w.f();
         return true;
      } else if ($$0 == 264 || $$0 == 257 || $$0 == 335) {
         this.v = this.v + 1 & 3;
         this.w.f();
         return true;
      } else {
         return this.w.a($$0) ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean a(char $$0, int $$1) {
      this.w.a($$0);
      return true;
   }

   @Override
   public void a(frc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.d();
      fhm.c();
      $$0.a(this.p, this.l, this.n / 2, 40, 16777215);
      this.d($$0);
      $$0.d();
      fhm.d();
   }

   @Override
   public void b(frc $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   @Override
   public void aK_() {
      this.F();
   }

   @Override
   public void aE_() {
      gje $$0 = this.m.L();
      if ($$0 != null) {
         $$0.b(new ail(this.a.aw_(), this.s, this.d[0], this.d[1], this.d[2], this.d[3]));
      }
   }

   @Override
   public boolean k() {
      return false;
   }

   protected abstract void c(frc var1);

   protected abstract Vector3f m();

   protected void a(frc $$0, dzo $$1) {
      $$0.c().a((float)this.n / 2.0F, 90.0F, 50.0F);
   }

   private void d(frc $$0) {
      $$0.c().a();
      this.a($$0, this.a.m());
      $$0.c().a();
      this.c($$0);
      $$0.c().b();
      this.e($$0);
      $$0.c().b();
   }

   private void e(frc $$0) {
      $$0.c().a(0.0F, 0.0F, 4.0F);
      Vector3f $$1 = this.m();
      $$0.c().b($$1.x(), $$1.y(), $$1.z());
      int $$2 = this.c.a() ? this.c.b().g() : grj.a(this.c);
      boolean $$3 = this.u / 6 % 2 == 0;
      int $$4 = this.w.g();
      int $$5 = this.w.h();
      int $$6 = 4 * this.a.a() / 2;
      int $$7 = this.v * this.a.a() - $$6;

      for (int $$8 = 0; $$8 < this.d.length; $$8++) {
         String $$9 = this.d[$$8];
         if ($$9 != null) {
            if (this.p.a()) {
               $$9 = this.p.a($$9);
            }

            int $$10 = -this.p.b($$9) / 2;
            $$0.a(this.p, $$9, $$10, $$8 * this.a.a() - $$6, $$2, false);
            if ($$8 == this.v && $$4 >= 0 && $$3) {
               int $$11 = this.p.b($$9.substring(0, Math.max(Math.min($$4, $$9.length()), 0)));
               int $$12 = $$11 - this.p.b($$9) / 2;
               if ($$4 >= $$9.length()) {
                  $$0.a(this.p, "_", $$12, $$7, $$2, false);
               }
            }
         }
      }

      for (int $$13 = 0; $$13 < this.d.length; $$13++) {
         String $$14 = this.d[$$13];
         if ($$14 != null && $$13 == this.v && $$4 >= 0) {
            int $$15 = this.p.b($$14.substring(0, Math.max(Math.min($$4, $$14.length()), 0)));
            int $$16 = $$15 - this.p.b($$14) / 2;
            if ($$3 && $$4 < $$14.length()) {
               $$0.a($$16, $$7 - 1, $$16 + 1, $$7 + this.a.a(), axu.f($$2));
            }

            if ($$5 != $$4) {
               int $$17 = Math.min($$4, $$5);
               int $$18 = Math.max($$4, $$5);
               int $$19 = this.p.b($$14.substring(0, $$17)) - this.p.b($$14) / 2;
               int $$20 = this.p.b($$14.substring(0, $$18)) - this.p.b($$14) / 2;
               int $$21 = Math.min($$19, $$20);
               int $$22 = Math.max($$19, $$20);
               $$0.a(gpn.N(), $$21, $$7, $$22, $$7 + this.a.a(), -16776961);
            }
         }
      }
   }

   private void a(String $$0) {
      this.d[this.v] = $$0;
      this.c = this.c.a(this.v, ww.b($$0));
      this.a.a(this.c, this.s);
   }

   private void F() {
      this.m.a(null);
   }
}
