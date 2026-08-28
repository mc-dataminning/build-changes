import com.mojang.blaze3d.buffers.BufferType;
import com.mojang.blaze3d.buffers.BufferUsage;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Vector3f;

public class gsi implements AutoCloseable {
   private static final alr b = alr.b("textures/environment/sun.png");
   private static final alr c = alr.b("textures/environment/moon_phases.png");
   public static final alr a = alr.b("textures/environment/end_sky.png");
   private static final float d = 512.0F;
   private static final int e = 10;
   private static final int f = 1500;
   private static final int g = 6;
   private final GpuBuffer h;
   private final RenderSystem.a i = RenderSystem.getSequentialBuffer(VertexFormat.b.h);
   private final GpuBuffer j;
   private final GpuBuffer k;
   private final GpuBuffer l;

   public gsi() {
      this.h = c();
      this.l = d();

      try (fla $$0 = new fla(10 * flb.e.getVertexSize())) {
         fkz $$1 = new fkz($$0, VertexFormat.b.g, flb.e);
         this.a($$1, 16.0F);

         try (flc $$2 = $$1.b()) {
            this.j = RenderSystem.getDevice().createBuffer(() -> "Top sky vertex buffer", BufferType.VERTICES, BufferUsage.STATIC_WRITE, $$2.a());
         }

         $$1 = new fkz($$0, VertexFormat.b.g, flb.e);
         this.a($$1, -16.0F);

         try (flc $$3 = $$1.b()) {
            this.k = RenderSystem.getDevice().createBuffer(() -> "Bottom sky vertex buffer", BufferType.VERTICES, BufferUsage.STATIC_WRITE, $$3.a());
         }
      }
   }

   private static GpuBuffer c() {
      bai $$0 = bai.a(10842L);
      float $$1 = 100.0F;

      GpuBuffer var18;
      try (fla $$2 = new fla(flb.e.getVertexSize() * 1500 * 4)) {
         fkz $$3 = new fkz($$2, VertexFormat.b.h, flb.e);

         for (int $$4 = 0; $$4 < 1500; $$4++) {
            float $$5 = $$0.i() * 2.0F - 1.0F;
            float $$6 = $$0.i() * 2.0F - 1.0F;
            float $$7 = $$0.i() * 2.0F - 1.0F;
            float $$8 = 0.15F + $$0.i() * 0.1F;
            float $$9 = azz.k($$5, $$6, $$7);
            if (!($$9 <= 0.010000001F) && !($$9 >= 1.0F)) {
               Vector3f $$10 = new Vector3f($$5, $$6, $$7).normalize(100.0F);
               float $$11 = (float)($$0.j() * (float) Math.PI * 2.0);
               Matrix3f $$12 = new Matrix3f().rotateTowards(new Vector3f($$10).negate(), new Vector3f(0.0F, 1.0F, 0.0F)).rotateZ(-$$11);
               $$3.a(new Vector3f($$8, -$$8, 0.0F).mul($$12).add($$10));
               $$3.a(new Vector3f($$8, $$8, 0.0F).mul($$12).add($$10));
               $$3.a(new Vector3f(-$$8, $$8, 0.0F).mul($$12).add($$10));
               $$3.a(new Vector3f(-$$8, -$$8, 0.0F).mul($$12).add($$10));
            }
         }

         try (flc $$13 = $$3.b()) {
            var18 = RenderSystem.getDevice().createBuffer(() -> "Stars vertex buffer", BufferType.VERTICES, BufferUsage.STATIC_WRITE, $$13.a());
         }
      }

      return var18;
   }

   private void a(flg $$0, float $$1) {
      float $$2 = Math.signum($$1) * 512.0F;
      $$0.a(0.0F, $$1, 0.0F);

      for (int $$3 = -180; $$3 <= 180; $$3 += 45) {
         $$0.a($$2 * azz.b((float)$$3 * (float) (Math.PI / 180.0)), $$1, 512.0F * azz.a((float)$$3 * (float) (Math.PI / 180.0)));
      }
   }

   public void a(float $$0, float $$1, float $$2) {
      RenderSystem.setShaderColor($$0, $$1, $$2, 1.0F);
      GpuTexture $$3 = fqq.Q().h().c();
      GpuTexture $$4 = fqq.Q().h().d();

      try (RenderPass $$5 = RenderSystem.getDevice().createCommandEncoder().createRenderPass($$3, OptionalInt.empty(), $$4, OptionalDouble.empty())) {
         $$5.setPipeline(grw.ak);
         $$5.setVertexBuffer(0, this.j);
         $$5.draw(0, 10);
      }

      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public void a() {
      RenderSystem.setShaderColor(0.0F, 0.0F, 0.0F, 1.0F);
      Matrix4fStack $$0 = RenderSystem.getModelViewStack();
      $$0.pushMatrix();
      $$0.translate(0.0F, 12.0F, 0.0F);
      GpuTexture $$1 = fqq.Q().h().c();
      GpuTexture $$2 = fqq.Q().h().d();

      try (RenderPass $$3 = RenderSystem.getDevice().createCommandEncoder().createRenderPass($$1, OptionalInt.empty(), $$2, OptionalDouble.empty())) {
         $$3.setPipeline(grw.ak);
         $$3.setVertexBuffer(0, this.k);
         $$3.draw(0, 10);
      }

      $$0.popMatrix();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public void a(fld $$0, grn.a $$1, float $$2, int $$3, float $$4, float $$5, grb $$6) {
      $$0.a();
      $$0.a(a.d.rotationDegrees(-90.0F));
      $$0.a(a.b.rotationDegrees($$2 * 360.0F));
      this.a($$4, $$1, $$0);
      this.a($$3, $$4, $$1, $$0);
      $$1.b();
      if ($$5 > 0.0F) {
         this.a($$6, $$5, $$0);
      }

      $$0.b();
   }

   private void a(float $$0, grn $$1, fld $$2) {
      float $$3 = 30.0F;
      float $$4 = 100.0F;
      flg $$5 = $$1.getBuffer(gry.C(b));
      int $$6 = ayh.a($$0);
      Matrix4f $$7 = $$2.c().a();
      $$5.a($$7, -30.0F, 100.0F, -30.0F).a(0.0F, 0.0F).a($$6);
      $$5.a($$7, 30.0F, 100.0F, -30.0F).a(1.0F, 0.0F).a($$6);
      $$5.a($$7, 30.0F, 100.0F, 30.0F).a(1.0F, 1.0F).a($$6);
      $$5.a($$7, -30.0F, 100.0F, 30.0F).a(0.0F, 1.0F).a($$6);
   }

   private void a(int $$0, float $$1, grn $$2, fld $$3) {
      float $$4 = 20.0F;
      int $$5 = $$0 % 4;
      int $$6 = $$0 / 4 % 2;
      float $$7 = (float)($$5 + 0) / 4.0F;
      float $$8 = (float)($$6 + 0) / 2.0F;
      float $$9 = (float)($$5 + 1) / 4.0F;
      float $$10 = (float)($$6 + 1) / 2.0F;
      float $$11 = 100.0F;
      flg $$12 = $$2.getBuffer(gry.C(c));
      int $$13 = ayh.a($$1);
      Matrix4f $$14 = $$3.c().a();
      $$12.a($$14, -20.0F, -100.0F, 20.0F).a($$9, $$10).a($$13);
      $$12.a($$14, 20.0F, -100.0F, 20.0F).a($$7, $$10).a($$13);
      $$12.a($$14, 20.0F, -100.0F, -20.0F).a($$7, $$8).a($$13);
      $$12.a($$14, -20.0F, -100.0F, -20.0F).a($$9, $$8).a($$13);
   }

   private void a(grb $$0, float $$1, fld $$2) {
      Matrix4fStack $$3 = RenderSystem.getModelViewStack();
      $$3.pushMatrix();
      $$3.mul($$2.c().a());
      RenderSystem.setShaderColor($$1, $$1, $$1, $$1);
      RenderSystem.setShaderFog(grb.a);
      RenderPipeline $$4 = grw.an;
      GpuTexture $$5 = fqq.Q().h().c();
      GpuTexture $$6 = fqq.Q().h().d();
      GpuBuffer $$7 = this.i.b(9000);

      try (RenderPass $$8 = RenderSystem.getDevice().createCommandEncoder().createRenderPass($$5, OptionalInt.empty(), $$6, OptionalDouble.empty())) {
         $$8.setPipeline($$4);
         $$8.setVertexBuffer(0, this.h);
         $$8.setIndexBuffer($$7, this.i.a());
         $$8.drawIndexed(0, 9000);
      }

      RenderSystem.setShaderFog($$0);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      $$3.popMatrix();
   }

   public void a(fld $$0, grn.a $$1, float $$2, int $$3) {
      $$0.a();
      $$0.a(a.b.rotationDegrees(90.0F));
      float $$4 = azz.a($$2) < 0.0F ? 180.0F : 0.0F;
      $$0.a(a.f.rotationDegrees($$4));
      $$0.a(a.f.rotationDegrees(90.0F));
      Matrix4f $$5 = $$0.c().a();
      flg $$6 = $$1.getBuffer(gry.E());
      float $$7 = ayh.i($$3);
      $$6.a($$5, 0.0F, 100.0F, 0.0F).a($$3);
      int $$8 = ayh.g($$3);
      int $$9 = 16;

      for (int $$10 = 0; $$10 <= 16; $$10++) {
         float $$11 = (float)$$10 * (float) (Math.PI * 2) / 16.0F;
         float $$12 = azz.a($$11);
         float $$13 = azz.b($$11);
         $$6.a($$5, $$12 * 120.0F, $$13 * 120.0F, -$$13 * 40.0F * $$7).a($$8);
      }

      $$0.b();
   }

   private static GpuBuffer d() {
      GpuBuffer var10;
      try (fla $$0 = new fla(24 * flb.j.getVertexSize())) {
         fkz $$1 = new fkz($$0, VertexFormat.b.h, flb.j);

         for (int $$2 = 0; $$2 < 6; $$2++) {
            Matrix4f $$3 = new Matrix4f();
            switch ($$2) {
               case 1:
                  $$3.rotationX((float) (Math.PI / 2));
                  break;
               case 2:
                  $$3.rotationX((float) (-Math.PI / 2));
                  break;
               case 3:
                  $$3.rotationX((float) Math.PI);
                  break;
               case 4:
                  $$3.rotationZ((float) (Math.PI / 2));
                  break;
               case 5:
                  $$3.rotationZ((float) (-Math.PI / 2));
            }

            $$1.a($$3, -100.0F, -100.0F, -100.0F).a(0.0F, 0.0F).a(-14145496);
            $$1.a($$3, -100.0F, -100.0F, 100.0F).a(0.0F, 16.0F).a(-14145496);
            $$1.a($$3, 100.0F, -100.0F, 100.0F).a(16.0F, 16.0F).a(-14145496);
            $$1.a($$3, 100.0F, -100.0F, -100.0F).a(16.0F, 0.0F).a(-14145496);
         }

         try (flc $$4 = $$1.b()) {
            var10 = RenderSystem.getDevice().createBuffer(() -> "End sky vertex buffer", BufferType.VERTICES, BufferUsage.STATIC_WRITE, $$4.a());
         }
      }

      return var10;
   }

   public void b() {
      hks $$0 = fqq.Q().aa();
      hkb $$1 = $$0.b(a);
      $$1.a(bbf.b, false);
      RenderSystem.a $$2 = RenderSystem.getSequentialBuffer(VertexFormat.b.h);
      GpuBuffer $$3 = $$2.b(36);
      GpuTexture $$4 = fqq.Q().h().c();
      GpuTexture $$5 = fqq.Q().h().d();

      try (RenderPass $$6 = RenderSystem.getDevice().createCommandEncoder().createRenderPass($$4, OptionalInt.empty(), $$5, OptionalDouble.empty())) {
         $$6.setPipeline(grw.al);
         $$6.bindSampler("Sampler0", $$1.a());
         $$6.setVertexBuffer(0, this.l);
         $$6.setIndexBuffer($$3, $$2.a());
         $$6.drawIndexed(0, 36);
      }
   }

   @Override
   public void close() {
      this.h.close();
      this.j.close();
      this.k.close();
      this.l.close();
   }
}
