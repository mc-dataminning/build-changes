import com.google.common.collect.EvictingQueue;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gaz implements auf {
   private static final Logger b = LogUtils.getLogger();
   private static final aku c = aku.a("particles");
   private static final alb d = new alb("particles");
   private static final int e = 16384;
   private static final List<gbb> f = ImmutableList.of(gbb.a, gbb.b, gbb.d, gbb.c, gbb.e);
   protected fxq a;
   private final Map<gbb, Queue<gax>> g = Maps.newIdentityHashMap();
   private final Queue<gbz> h = Queues.newArrayDeque();
   private final gov i;
   private final azc j = azc.a();
   private final Int2ObjectMap<gba<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<gax> l = Queues.newArrayDeque();
   private final Map<alb, gaz.b> m = Maps.newHashMap();
   private final got n;
   private final Object2IntOpenHashMap<lg> o = new Object2IntOpenHashMap();

   public gaz(fxq $$0, gov $$1) {
      this.n = new got(got.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(lj.a, gao.a::new);
      this.a(lj.c, new fzq.a());
      this.a(lj.b, new gbw.b());
      this.a(lj.d, fzt.a::new);
      this.a(lj.aq, fzs.a::new);
      this.a(lj.ao, fzu.a::new);
      this.a(lj.at, fzv.a::new);
      this.a(lj.au, fzv.b::new);
      this.a(lj.e, gbc.a::new);
      this.a(lj.P, gbv.a::new);
      this.a(lj.f, fzx.c::new);
      this.a(lj.ap, gcd.a::new);
      this.a(lj.g, fzx.a::new);
      this.a(lj.h, fzy.a::new);
      this.a(lj.as, gbv.b::new);
      this.a(lj.i, fzz::c);
      this.a(lj.j, fzz::d);
      this.a(lj.k, fzz::e);
      this.a(lj.l, fzz::a);
      this.a(lj.m, fzz::b);
      this.a(lj.n, gab.a::new);
      this.a(lj.o, gaa.a::new);
      this.a(lj.p, gbp.c::new);
      this.a(lj.q, new gau.a());
      this.a(lj.r, fzx.b::new);
      this.a(lj.s, gak.a::new);
      this.a(lj.t, gae.a::new);
      this.a(lj.u, gbp.b::new);
      this.a(lj.v, new gaq.a());
      this.a(lj.w, gap.a::new);
      this.a(lj.B, gbn.a::new);
      this.a(lj.C, gag.a::new);
      this.a(lj.x, gam.a::new);
      this.a(lj.y, gam.b::new);
      this.a(lj.z, new gan.a(3.0, 7, 0));
      this.a(lj.A, new gan.a(1.0, 3, 2));
      this.a(lj.D, gah.d::new);
      this.a(lj.E, gcc.a::new);
      this.a(lj.F, gai.a::new);
      this.a(lj.G, gbp.c::new);
      this.a(lj.I, gbo.a::new);
      this.a(lj.J, gbg.a::new);
      this.a(lj.K, gbh.a::new);
      this.a(lj.M, gbo.b::new);
      this.a(lj.L, gai.a::new);
      this.a(lj.N, gah.a::new);
      this.a(lj.O, gbv.d::new);
      this.a(lj.Q, gao.b::new);
      this.a(lj.R, gbp.a::new);
      this.a(lj.S, new fzr.b());
      this.a(lj.U, new fzr.c());
      this.a(lj.V, new fzr.a());
      this.a(lj.W, new fzr.d());
      this.a(lj.X, gas.a::new);
      this.a(lj.Y, gat.a::new);
      this.a(lj.Z, gbv.e::new);
      this.a(lj.ar, gak.b::new);
      this.a(lj.aa, gaw.a::new);
      this.a(lj.ab, gaf.a::new);
      this.a(lj.ac, gbd.a::new);
      this.a(lj.ad, gce.a::new);
      this.a(lj.ae, gbl.a::new);
      this.a(lj.af, gcg.a::new);
      this.a(lj.ag, gbc.b::new);
      this.a(lj.aK, gbm.a::new);
      this.a(lj.ah, gbq.a::new);
      this.a(lj.aj, fzo.a::new);
      this.a(lj.ak, gby.a::new);
      this.a(lj.ai, gbt.b::new);
      this.a(lj.al, gbu.c::new);
      this.a(lj.am, gbr.a::new);
      this.a(lj.an, gbp.d::new);
      this.a(lj.av, fzz::f);
      this.a(lj.aw, fzz::g);
      this.a(lj.ax, fzz::h);
      this.a(lj.ay, fzz::m);
      this.a(lj.az, fzz::n);
      this.a(lj.aD, gbu.b::new);
      this.a(lj.aA, fzn.a::new);
      this.a(lj.aB, gbu.a::new);
      this.a(lj.aC, gbu.d::new);
      this.a(lj.aE, fzz::o);
      this.a(lj.aF, fzz::p);
      this.a(lj.aG, fzz::q);
      this.a(lj.aH, gbe.a::new);
      this.a(lj.aI, gcf.a::new);
      this.a(lj.aJ, gai.b::new);
      this.a(lj.aN, fzz::i);
      this.a(lj.aO, fzz::j);
      this.a(lj.H, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new fzw($$2, $$3, $$4, $$5, $$0));
      this.a(lj.aL, fzz::k);
      this.a(lj.aM, fzz::l);
      this.a(lj.T, gcb.a::new);
      this.a(lj.aP, gbt.a::new);
      this.a(lj.aQ, gal.b::new);
      this.a(lj.aR, gal.e::new);
      this.a(lj.aS, gal.d::new);
      this.a(lj.aT, gal.a::new);
      this.a(lj.aU, gal.c::new);
      this.a(lj.aV, gbi.a::new);
      this.a(lj.aW, gbv.c::new);
      this.a(lj.aX, gad.a::new);
      this.a(lj.aY, gca.a::new);
      this.a(lj.aZ, gca.a::new);
      this.a(lj.ba, gak.c::new);
      this.a(lj.bb, new gbw.a());
      this.a(lj.bd, gbp.c::new);
      this.a(lj.be, gbp.c::new);
      this.a(lj.bc, gaj.a::new);
   }

   private <T extends lh> void a(li<T> $$0, gba<T> $$1) {
      this.k.put(lp.j.a($$0), $$1);
   }

   private <T extends lh> void a(li<T> $$0, gba.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            gbx $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends lh> void a(li<T> $$0, gaz.c<T> $$1) {
      gaz.b $$2 = new gaz.b();
      this.m.put(lp.j.b($$0), $$2);
      this.k.put(lp.j.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(auf.a $$0, aul $$1, bnd $$2, bnd $$3, Executor $$4, Executor $$5) {
      record a(alb a, Optional<List<alb>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<alb, auj>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            alb $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ac.d($$2x);
      });
      CompletableFuture<gop.a> $$7 = gop.a(this.n).a($$1, d, 0, $$4).thenCompose(gop.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         gop.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<alb> $$5x = new HashSet<>();
         gou $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<alb>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<gou> $$5xx = new ArrayList<>();

               for (alb $$6xx : $$4xx.get()) {
                  gou $$7x = $$4x.f().get($$6xx);
                  if ($$7x == null) {
                     $$5x.add($$6xx);
                     $$5xx.add($$6x);
                  } else {
                     $$5xx.add($$7x);
                  }
               }

               if ($$5xx.isEmpty()) {
                  $$5xx.add($$6x);
               }

               this.m.get($$3xx.a()).a($$5xx);
            }
         });
         if (!$$5x.isEmpty()) {
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(alb::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<alb>> a(alb $$0, auj $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               gay $$3 = gay.a(ayk.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bsp $$0, lh $$1) {
      this.h.add(new gbz(this.a, $$0, $$1));
   }

   public void a(bsp $$0, lh $$1, int $$2) {
      this.h.add(new gbz(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public gax a(lh $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gax $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends lh> gax b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gba<T> $$7 = (gba<T>)this.k.get(lp.j.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(gax $$0) {
      Optional<lg> $$1 = $$0.o();
      if ($$1.isPresent()) {
         if (this.a($$1.get())) {
            this.l.add($$0);
            this.a($$1.get(), 1);
         }
      } else {
         this.l.add($$0);
      }
   }

   public void b() {
      this.g.forEach(($$0, $$1x) -> {
         this.a.ag().a($$0.toString());
         this.a($$1x);
         this.a.ag().c();
      });
      if (!this.h.isEmpty()) {
         List<gbz> $$0 = Lists.newArrayList();

         for (gbz $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      gax $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<gax> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<gax> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            gax $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(lg $$0, int $$1) {
      this.o.addTo($$0, $$1);
   }

   private void b(gax $$0) {
      try {
         $$0.a();
      } catch (Throwable var5) {
         o $$2 = o.a(var5, "Ticking Particle");
         p $$3 = $$2.a("Particle being ticked");
         $$3.a("Particle", $$0::toString);
         $$3.a("Particle Type", $$0.b()::toString);
         throw new y($$2);
      }
   }

   public void a(gdi $$0, fel $$1, float $$2) {
      $$0.c();
      RenderSystem.enableDepthTest();

      for (gbb $$3 : f) {
         Iterable<gax> $$4 = this.g.get($$3);
         if ($$4 != null) {
            RenderSystem.setShader(gdc::u);
            ezv $$5 = ezv.b();
            ezo $$6 = $$5.d();
            $$3.a($$6, this.i);

            for (gax $$7 : $$4) {
               try {
                  $$7.a($$6, $$1, $$2);
               } catch (Throwable var14) {
                  o $$9 = o.a(var14, "Rendering Particle");
                  p $$10 = $$9.a("Particle being rendered");
                  $$10.a("Particle", $$7::toString);
                  $$10.a("Particle Type", $$3::toString);
                  throw new y($$9);
               }
            }

            $$3.a($$5);
         }
      }

      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      $$0.b();
   }

   public void a(@Nullable fxq $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(iz $$0, drx $$1) {
      if (!$$1.i() && $$1.z()) {
         ewf $$2 = $$1.j(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, ayu.c($$8 / 0.25));
               int $$12 = Math.max(2, ayu.c($$9 / 0.25));
               int $$13 = Math.max(2, ayu.c($$10 / 0.25));

               for (int $$14 = 0; $$14 < $$11; $$14++) {
                  for (int $$15 = 0; $$15 < $$12; $$15++) {
                     for (int $$16 = 0; $$16 < $$13; $$16++) {
                        double $$17 = ((double)$$14 + 0.5) / (double)$$11;
                        double $$18 = ((double)$$15 + 0.5) / (double)$$12;
                        double $$19 = ((double)$$16 + 0.5) / (double)$$13;
                        double $$20 = $$17 * $$8 + $$2x;
                        double $$21 = $$18 * $$9 + $$3x;
                        double $$22 = $$19 * $$10 + $$4;
                        this.a(
                           new gbw(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(iz $$0, je $$1) {
      drx $$2 = this.a.a_($$0);
      if ($$2.l() != dla.a && $$2.z()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         evh $$7 = $$2.j(this.a, $$0).a();
         double $$8 = (double)$$3 + this.j.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.j.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.j.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == je.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == je.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == je.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == je.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == je.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == je.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new gbw(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(lg $$0) {
      return this.o.getInt($$0) < $$0.a();
   }

   private void f() {
      this.g.clear();
      this.l.clear();
      this.h.clear();
      this.o.clear();
   }

   static class b implements gbs {
      private List<gou> a;

      @Override
      public gou a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public gou a(azc $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<gou> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends lh> {
      gba<T> create(gbs var1);
   }
}
