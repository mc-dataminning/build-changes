import com.mojang.blaze3d.buffers.BufferType;
import com.mojang.blaze3d.buffers.BufferUsage;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import org.joml.Matrix4f;

public class gso {
   public static final alr a = alr.b("textures/misc/forcefield.png");
   private boolean b = true;
   private double c;
   private double d;
   private double e;
   private double f;
   private double g;
   private double h;
   private final GpuBuffer i = RenderSystem.getDevice()
      .createBuffer(() -> "World border vertex buffer", BufferType.VERTICES, BufferUsage.DYNAMIC_WRITE, 16 * flb.i.getVertexSize());
   private final RenderSystem.a j = RenderSystem.getSequentialBuffer(VertexFormat.b.h);

   private void a(edi $$0, double $$1, double $$2, double $$3, float $$4, float $$5, float $$6) {
      try (fla $$7 = new fla(flb.i.getVertexSize() * 4)) {
         double $$8 = $$0.e();
         double $$9 = $$0.g();
         double $$10 = $$0.f();
         double $$11 = $$0.h();
         double $$12 = Math.max((double)azz.a($$2 - $$1), $$10);
         double $$13 = Math.min((double)azz.c($$2 + $$1), $$11);
         float $$14 = (float)(azz.a($$12) & 1) * 0.5F;
         float $$15 = (float)($$13 - $$12) / 2.0F;
         double $$16 = Math.max((double)azz.a($$3 - $$1), $$8);
         double $$17 = Math.min((double)azz.c($$3 + $$1), $$9);
         float $$18 = (float)(azz.a($$16) & 1) * 0.5F;
         float $$19 = (float)($$17 - $$16) / 2.0F;
         fkz $$20 = new fkz($$7, VertexFormat.b.h, flb.i);
         $$20.a(0.0F, -$$4, (float)($$11 - $$12)).a($$18, $$5);
         $$20.a((float)($$17 - $$16), -$$4, (float)($$11 - $$12)).a($$19 + $$18, $$5);
         $$20.a((float)($$17 - $$16), $$4, (float)($$11 - $$12)).a($$19 + $$18, $$6);
         $$20.a(0.0F, $$4, (float)($$11 - $$12)).a($$18, $$6);
         $$20.a(0.0F, -$$4, 0.0F).a($$14, $$5);
         $$20.a(0.0F, -$$4, (float)($$13 - $$12)).a($$15 + $$14, $$5);
         $$20.a(0.0F, $$4, (float)($$13 - $$12)).a($$15 + $$14, $$6);
         $$20.a(0.0F, $$4, 0.0F).a($$14, $$6);
         $$20.a((float)($$17 - $$16), -$$4, 0.0F).a($$18, $$5);
         $$20.a(0.0F, -$$4, 0.0F).a($$19 + $$18, $$5);
         $$20.a(0.0F, $$4, 0.0F).a($$19 + $$18, $$6);
         $$20.a((float)($$17 - $$16), $$4, 0.0F).a($$18, $$6);
         $$20.a((float)($$9 - $$16), -$$4, (float)($$13 - $$12)).a($$14, $$5);
         $$20.a((float)($$9 - $$16), -$$4, 0.0F).a($$15 + $$14, $$5);
         $$20.a((float)($$9 - $$16), $$4, 0.0F).a($$15 + $$14, $$6);
         $$20.a((float)($$9 - $$16), $$4, (float)($$13 - $$12)).a($$14, $$6);

         try (flc $$21 = $$20.b()) {
            RenderSystem.getDevice().createCommandEncoder().writeToBuffer(this.i, $$21.a(), 0);
         }

         this.e = $$8;
         this.f = $$9;
         this.g = $$10;
         this.h = $$11;
         this.c = $$16;
         this.d = $$12;
         this.b = false;
      }
   }

   public void a(edi $$0, fgc $$1, double $$2, double $$3) {
      double $$4 = $$0.e();
      double $$5 = $$0.g();
      double $$6 = $$0.f();
      double $$7 = $$0.h();
      if ((!($$1.d < $$5 - $$2) || !($$1.d > $$4 + $$2) || !($$1.f < $$7 - $$2) || !($$1.f > $$6 + $$2))
         && !($$1.d < $$4 - $$2)
         && !($$1.d > $$5 + $$2)
         && !($$1.f < $$6 - $$2)
         && !($$1.f > $$7 + $$2)) {
         double $$8 = 1.0 - $$0.b($$1.d, $$1.f) / $$2;
         $$8 = Math.pow($$8, 4.0);
         $$8 = azz.a($$8, 0.0, 1.0);
         double $$9 = $$1.d;
         double $$10 = $$1.f;
         float $$11 = (float)$$3;
         int $$12 = $$0.d().a();
         float $$13 = (float)ayh.b($$12) / 255.0F;
         float $$14 = (float)ayh.c($$12) / 255.0F;
         float $$15 = (float)ayh.d($$12) / 255.0F;
         RenderSystem.setShaderColor($$13, $$14, $$15, (float)$$8);
         float $$16 = (float)(ag.c() % 3000L) / 3000.0F;
         RenderSystem.setTextureMatrix(new Matrix4f().translation($$16, $$16, 0.0F));
         float $$17 = (float)(-azz.e($$1.e * 0.5));
         float $$18 = $$17 + $$11;
         if (this.a($$0)) {
            this.a($$0, $$2, $$10, $$9, $$11, $$18, $$17);
         }

         RenderSystem.setModelOffset((float)(this.c - $$9), (float)(-$$1.e), (float)(this.d - $$10));
         hks $$19 = fqq.Q().aa();
         hkb $$20 = $$19.b(a);
         $$20.a(bbf.b, false);
         RenderPipeline $$21 = grw.af;
         fjr $$22 = fqq.Q().h();
         fjr $$23 = fqq.Q().f.t();
         GpuTexture $$24;
         GpuTexture $$25;
         if ($$23 != null) {
            $$24 = $$23.c();
            $$25 = $$23.d();
         } else {
            $$24 = $$22.c();
            $$25 = $$22.d();
         }

         GpuBuffer $$28 = this.j.b(6);

         try (RenderPass $$29 = RenderSystem.getDevice().createCommandEncoder().createRenderPass($$24, OptionalInt.empty(), $$25, OptionalDouble.empty())) {
            $$29.setPipeline($$21);
            $$29.setIndexBuffer($$28, this.j.a());
            $$29.bindSampler("Sampler0", $$20.a());
            $$29.setVertexBuffer(0, this.i);
            ArrayList<RenderPass.a> $$30 = new ArrayList<>();

            for (edi.b $$31 : $$0.c($$9, $$10)) {
               if ($$31.b() < $$2) {
                  int $$32 = $$31.a().e();
                  $$30.add(new RenderPass.a(0, this.i, $$28, this.j.a(), 6 * $$32, 6));
               }
            }

            $$29.drawMultipleIndexed($$30, null, null);
         }

         RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.resetTextureMatrix();
         RenderSystem.resetModelOffset();
      }
   }

   public void a() {
      this.b = true;
   }

   private boolean a(edi $$0) {
      return this.b || $$0.e() != this.e || $$0.f() != this.g || $$0.g() != this.f || $$0.h() != this.h;
   }
}
