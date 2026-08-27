import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class zr implements wu<yo> {
   private final double a;
   private final double b;
   private final double c;
   private final float d;
   private final List<hv> e;
   private final float f;
   private final float g;
   private final float h;
   private final jt i;
   private final jt j;
   private final csq.a k;
   private final arb l;

   public zr(double $$0, double $$1, double $$2, float $$3, List<hv> $$4, @Nullable elb $$5, csq.a $$6, jt $$7, jt $$8, arb $$9) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = Lists.newArrayList($$4);
      this.l = $$9;
      if ($$5 != null) {
         this.f = (float)$$5.c;
         this.g = (float)$$5.d;
         this.h = (float)$$5.e;
      } else {
         this.f = 0.0F;
         this.g = 0.0F;
         this.h = 0.0F;
      }

      this.k = $$6;
      this.i = $$7;
      this.j = $$8;
   }

   public zr(ue $$0) {
      this.a = $$0.readDouble();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readFloat();
      int $$1 = aty.a(this.a);
      int $$2 = aty.a(this.b);
      int $$3 = aty.a(this.c);
      this.e = $$0.a((ue.a<hv>)($$3x -> {
         int $$4 = $$3x.readByte() + $$1;
         int $$5 = $$3x.readByte() + $$2;
         int $$6 = $$3x.readByte() + $$3;
         return new hv($$4, $$5, $$6);
      }));
      this.f = $$0.readFloat();
      this.g = $$0.readFloat();
      this.h = $$0.readFloat();
      this.k = $$0.b(csq.a.class);
      this.i = a($$0, $$0.a(kb.j));
      this.j = a($$0, $$0.a(kb.j));
      this.l = arb.b($$0);
   }

   private static <T extends jt> T a(ue $$0, ju<T> $$1) {
      return $$1.d().b($$1, $$0);
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      int $$1 = aty.a(this.a);
      int $$2 = aty.a(this.b);
      int $$3 = aty.a(this.c);
      $$0.a(this.e, ($$3x, $$4) -> {
         int $$5 = $$4.u() - $$1;
         int $$6 = $$4.v() - $$2;
         int $$7 = $$4.w() - $$3;
         $$3x.k($$5);
         $$3x.k($$6);
         $$3x.k($$7);
      });
      $$0.a(this.f);
      $$0.a(this.g);
      $$0.a(this.h);
      $$0.a(this.k);
      $$0.a(kb.j, this.i.b());
      $$0.a(kb.j, this.j.b());
      this.l.a($$0);
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public float a() {
      return this.f;
   }

   public float d() {
      return this.g;
   }

   public float e() {
      return this.h;
   }

   public double f() {
      return this.a;
   }

   public double g() {
      return this.b;
   }

   public double h() {
      return this.c;
   }

   public float i() {
      return this.d;
   }

   public List<hv> j() {
      return this.e;
   }

   public csq.a k() {
      return this.k;
   }

   public jt l() {
      return this.i;
   }

   public jt m() {
      return this.j;
   }

   public arb n() {
      return this.l;
   }
}
