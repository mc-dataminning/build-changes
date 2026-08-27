import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class vv implements uo<ur> {
   private final double a;
   private final double b;
   private final double c;
   private final float d;
   private final List<gu> e;
   private final float f;
   private final float g;
   private final float h;

   public vv(double $$0, double $$1, double $$2, float $$3, List<gu> $$4, @Nullable eei $$5) {
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

   public vv(sf $$0) {
      this.a = $$0.readDouble();
      this.b = $$0.readDouble();
      this.c = $$0.readDouble();
      this.d = $$0.readFloat();
      int $$1 = apa.a(this.a);
      int $$2 = apa.a(this.b);
      int $$3 = apa.a(this.c);
      this.e = $$0.a((sf.a<gu>)($$3x -> {
         int $$4 = $$3x.readByte() + $$1;
         int $$5 = $$3x.readByte() + $$2;
         int $$6 = $$3x.readByte() + $$3;
         return new gu($$4, $$5, $$6);
      }));
      this.f = $$0.readFloat();
      this.g = $$0.readFloat();
      this.h = $$0.readFloat();
   }

   @Override
   public void a(sf $$0) {
      $$0.writeDouble(this.a);
      $$0.writeDouble(this.b);
      $$0.writeDouble(this.c);
      $$0.writeFloat(this.d);
      int $$1 = apa.a(this.a);
      int $$2 = apa.a(this.b);
      int $$3 = apa.a(this.c);
      $$0.a(this.e, ($$3x, $$4) -> {
         int $$5 = $$4.u() - $$1;
         int $$6 = $$4.v() - $$2;
         int $$7 = $$4.w() - $$3;
         $$3x.writeByte($$5);
         $$3x.writeByte($$6);
         $$3x.writeByte($$7);
      });
      $$0.writeFloat(this.f);
      $$0.writeFloat(this.g);
      $$0.writeFloat(this.h);
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public float a() {
      return this.f;
   }

   public float c() {
      return this.g;
   }

   public float d() {
      return this.h;
   }

   public double e() {
      return this.a;
   }

   public double f() {
      return this.b;
   }

   public double g() {
      return this.c;
   }

   public float h() {
      return this.d;
   }

   public List<gu> i() {
      return this.e;
   }
}
