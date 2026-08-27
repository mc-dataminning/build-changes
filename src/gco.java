import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import java.util.List;
import java.util.function.IntSupplier;
import org.joml.Matrix4f;

public class gco implements AutoCloseable {
   private final gca c;
   public final exg a;
   public final exg b;
   private final List<IntSupplier> d = Lists.newArrayList();
   private final List<String> e = Lists.newArrayList();
   private final List<Integer> f = Lists.newArrayList();
   private final List<Integer> g = Lists.newArrayList();
   private Matrix4f h;
   private final int i;

   public gco(aua $$0, String $$1, exg $$2, exg $$3, boolean $$4) throws IOException {
      this.c = new gca($$0, $$1);
      this.a = $$2;
      this.b = $$3;
      this.i = $$4 ? 9729 : 9728;
   }

   @Override
   public void close() {
      this.c.close();
   }

   public final String a() {
      return this.c.h();
   }

   public void a(String $$0, IntSupplier $$1, int $$2, int $$3) {
      this.e.add(this.e.size(), $$0);
      this.d.add(this.d.size(), $$1);
      this.f.add(this.f.size(), $$2);
      this.g.add(this.g.size(), $$3);
   }

   public void a(Matrix4f $$0) {
      this.h = $$0;
   }

   public void a(float $$0) {
      this.a.e();
      float $$1 = (float)this.b.c;
      float $$2 = (float)this.b.d;
      RenderSystem.viewport(0, 0, (int)$$1, (int)$$2);
      this.c.a("DiffuseSampler", this.a::f);

      for (int $$3 = 0; $$3 < this.d.size(); $$3++) {
         this.c.a(this.e.get($$3), this.d.get($$3));
         this.c.b("AuxSize" + $$3).a((float)this.f.get($$3).intValue(), (float)this.g.get($$3).intValue());
      }

      this.c.b("ProjMat").a(this.h);
      this.c.b("InSize").a((float)this.a.c, (float)this.a.d);
      this.c.b("OutSize").a($$1, $$2);
      this.c.b("Time").a($$0);
      feb $$4 = feb.Q();
      this.c.b("ScreenSize").a((float)$$4.aO().k(), (float)$$4.aO().l());
      this.c.g();
      this.b.b(feb.a);
      this.b.a(false);
      RenderSystem.depthFunc(519);
      eyp $$5 = eyw.b().d();
      $$5.a(eyz.b.h, eys.m);
      $$5.a(0.0, 0.0, 500.0).e();
      $$5.a((double)$$1, 0.0, 500.0).e();
      $$5.a((double)$$1, (double)$$2, 500.0).e();
      $$5.a(0.0, (double)$$2, 500.0).e();
      eyq.b($$5.d());
      RenderSystem.depthFunc(515);
      this.c.f();
      this.b.e();
      this.a.d();

      for (Object $$6 : this.d) {
         if ($$6 instanceof exg) {
            ((exg)$$6).d();
         }
      }
   }

   public gca b() {
      return this.c;
   }

   public int c() {
      return this.i;
   }
}
