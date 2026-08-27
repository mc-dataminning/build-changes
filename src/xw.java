import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class xw implements va<ws> {
   private final double a;
   private final double b;
   private final double c;
   private final float d;
   private final List<gw> e;
   private final float f;
   private final float g;
   private final float h;

   public xw(double $$0, double $$1, double $$2, float $$3, List<gw> $$4, @Nullable ehi $$5) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = Lists.newArrayList($$4);
      if ($$5 != null) {
         this.f = (float)$$5.c;
         this.g = (float)$$5.d;
         this.h = (float)$$5.e;
      } else {
         this.f = 0.0F;
         this.g = 0.0F;
         this.h = 0.0F;
      }
   }

   public xw(sl $$0) {
      this.a = $$0.readDouble();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readFloat();
      int $$1 = ars.a(this.a);
      int $$2 = ars.a(this.b);
      int $$3 = ars.a(this.c);
      this.e = $$0.a((sl.a<gw>)($$3x -> {
         int $$4 = $$3x.readByte() + $$1;
         int $$5 = $$3x.readByte() + $$2;
         int $$6 = $$3x.readByte() + $$3;
         return new gw($$4, $$5, $$6);
      }));
      this.f = $$0.readFloat();
      this.g = $$0.readFloat();
      this.h = $$0.readFloat();
   }

   @Override
   public void a(sl $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      int $$1 = ars.a(this.a);
      int $$2 = ars.a(this.b);
      int $$3 = ars.a(this.c);
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
   }

   public void a(ws $$0) {
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

   public List<gw> j() {
      return this.e;
   }
}
