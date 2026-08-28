import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fyj extends fyn {
   static final alg b = alg.b("container/slot");
   static final Logger c = LogUtils.getLogger();
   private static final int d = 18;
   private static final int s = 20;
   private static final int u = 1;
   private static final int v = 1;
   private static final int w = 2;
   private static final int x = 2;
   private static final alf<dkk> y = dkr.b;
   public static final wy a = wy.c("flat_world_preset.unknown");
   private final fxo z;
   private wy A;
   private wy B;
   private fyj.a C;
   private fsv D;
   fte E;
   epl F;

   public fyj(fxo $$0) {
      super(wy.c("createWorld.customize.presets.title"));
      this.z = $$0;
   }

   @Nullable
   private static epi a(jg<dmm> $$0, String $$1, int $$2) {
      List<String> $$3 = Splitter.on('*').limit(2).splitToList($$1);
      int $$5;
      String $$4;
      if ($$3.size() == 2) {
         $$4 = $$3.get(1);

         try {
            $$5 = Math.max(Integer.parseInt($$3.get(0)), 0);
         } catch (NumberFormatException var11) {
            c.error("Error while parsing flat world string", var11);
            return null;
         }
      } else {
         $$4 = $$3.get(0);
         $$5 = 1;
      }

      int $$9 = Math.min($$2 + $$5, eel.c);
      int $$10 = $$9 - $$2;

      Optional<jf.c<dmm>> $$11;
      try {
         $$11 = $$0.a(alf.a(mh.i, alg.a($$4)));
      } catch (Exception var10) {
         c.error("Error while parsing flat world string", var10);
         return null;
      }

      if ($$11.isEmpty()) {
         c.error("Error while parsing flat world string => Unknown block, {}", $$4);
         return null;
      } else {
         return new epi($$10, $$11.get().a());
      }
   }

   private static List<epi> a(jg<dmm> $$0, String $$1) {
      List<epi> $$2 = Lists.newArrayList();
      String[] $$3 = $$1.split(",");
      int $$4 = 0;

      for (String $$5 : $$3) {
         epi $$6 = a($$0, $$5, $$4);
         if ($$6 == null) {
            return Collections.emptyList();
         }

         $$2.add($$6);
         $$4 += $$6.a();
      }

      return $$2;
   }

   public static epl a(jg<dmm> $$0, jg<dkk> $$1, jg<ero> $$2, jg<eqm> $$3, String $$4, epl $$5) {
      Iterator<String> $$6 = Splitter.on(';').split($$4).iterator();
      if (!$$6.hasNext()) {
         return epl.a($$1, $$2, $$3);
      } else {
         List<epi> $$7 = a($$0, $$6.next());
         if ($$7.isEmpty()) {
            return epl.a($$1, $$2, $$3);
         } else {
            jf.c<dkk> $$8 = $$1.b(y);
            jf<dkk> $$9 = $$8;
            if ($$6.hasNext()) {
               String $$10 = $$6.next();
               $$9 = Optional.ofNullable(alg.c($$10)).map($$0x -> alf.a(mh.aG, $$0x)).flatMap($$1::a).orElseGet(() -> {
                  c.warn("Invalid biome: {}", $$10);
                  return $$8;
               });
            }

            return $$5.a($$7, $$5.c(), $$9);
         }
      }
   }

   static String a(epl $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (int $$2 = 0; $$2 < $$0.e().size(); $$2++) {
         if ($$2 > 0) {
            $$1.append(",");
         }

         $$1.append($$0.e().get($$2));
      }

      $$1.append(";");
      $$1.append($$0.d().e().map(alf::a).orElseThrow(() -> new IllegalStateException("Biome not registered")));
      return $$1.toString();
   }

   @Override
   protected void aO_() {
      this.A = wy.c("createWorld.customize.presets.share");
      this.B = wy.c("createWorld.customize.presets.list");
      this.E = new fte(this.p, 50, 40, this.n - 100, 20, this.A);
      this.E.f(1230);
      gdy $$0 = this.z.a.m().k();
      jt $$1 = $$0.a();
      cut $$2 = $$0.h().b();
      jg<dkk> $$3 = $$1.f(mh.aG);
      jg<ero> $$4 = $$1.f(mh.bd);
      jg<eqm> $$5 = $$1.f(mh.bb);
      jg<dmm> $$6 = $$1.f(mh.i).a($$2);
      this.E.a(a(this.z.l()));
      this.F = this.z.l();
      this.d(this.E);
      this.C = this.c(new fyj.a($$1, $$2));
      this.D = this.c(fsv.a(wy.c("createWorld.customize.presets.select"), $$4x -> {
         epl $$5x = a($$6, $$3, $$4, $$5, this.E.a(), this.F);
         this.z.a($$5x);
         this.m.a(this.z);
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a());
      this.c(fsv.a(wx.e, $$0x -> this.m.a(this.z)).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
      this.c(this.C.p() != null);
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      return this.C.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(fpo $$0, int $$1, int $$2) {
      String $$3 = this.E.a();
      this.b($$0, $$1, $$2);
      this.E.a($$3);
   }

   @Override
   public void aL_() {
      this.m.a(this.z);
   }

   @Override
   public void a(fsh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 400.0F);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
      $$0.b(this.p, this.A, 51, 30, 10526880);
      $$0.b(this.p, this.B, 51, 68, 10526880);
      $$0.c().b();
      this.E.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void c(boolean $$0) {
      this.D.j = $$0 || this.E.a().length() > 1;
   }

   class a extends ftr<fyj.a.a> {
      public a(final jt $$0, final cut $$1) {
         super(fyj.this.m, fyj.this.n, fyj.this.o - 117, 80, 24);

         for (jf<epj> $$2 : $$0.f(mh.aS).c(axg.a)) {
            Set<dmm> $$3 = $$2.a().b().e().stream().map($$0x -> $$0x.b().b()).filter($$1x -> !$$1x.a($$1)).collect(Collectors.toSet());
            if (!$$3.isEmpty()) {
               fyj.c
                  .info(
                     "Discarding flat world preset {} since it contains experimental blocks {}",
                     $$2.e().map($$0x -> $$0x.a().toString()).orElse("<unknown>"),
                     $$3
                  );
            } else {
               this.b(new fyj.a.a($$2));
            }
         }
      }

      public void a(@Nullable fyj.a.a $$0) {
         super.a($$0);
         fyj.this.c($$0 != null);
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         if (super.a($$0, $$1, $$2)) {
            return true;
         } else {
            if (fwx.a($$0) && this.p() != null) {
               this.p().b();
            }

            return false;
         }
      }

      public class a extends ftr.a<fyj.a.a> {
         private static final alg b = alg.b("textures/gui/container/stats_icons.png");
         private final epj c;
         private final wy d;

         public a(final jf<epj> $$1) {
            this.c = $$1.a();
            this.d = $$1.e().map($$0x -> wy.c($$0x.a().h("flat_world_preset"))).orElse(fyj.a);
         }

         @Override
         public void a(fsh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            this.a($$0, $$3, $$2, this.c.a().a());
            $$0.b(fyj.this.p, this.d, $$3 + 18 + 5, $$2 + 6, -1);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            this.b();
            return super.a($$0, $$1, $$2);
         }

         void b() {
            a.this.a(this);
            fyj.this.F = this.c.b();
            fyj.this.E.a(fyj.a(fyj.this.F));
            fyj.this.E.b(false);
         }

         private void a(fsh $$0, int $$1, int $$2, czg $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            $$0.b(new czk($$3), $$1 + 2, $$2 + 2);
         }

         private void a(fsh $$0, int $$1, int $$2) {
            $$0.a(gqx::H, fyj.b, $$1, $$2, 18, 18);
         }

         @Override
         public wy a() {
            return wy.a("narrator.select", this.d);
         }
      }
   }
}
