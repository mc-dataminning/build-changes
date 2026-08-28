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

public class gbd implements aui {
   private static final Logger b = LogUtils.getLogger();
   private static final akx c = akx.a("particles");
   private static final ale d = new ale("particles");
   private static final int e = 16384;
   private static final List<gbf> f = ImmutableList.of(gbf.a, gbf.b, gbf.d, gbf.c, gbf.e);
   protected fxu a;
   private final Map<gbf, Queue<gbb>> g = Maps.newIdentityHashMap();
   private final Queue<gcd> h = Queues.newArrayDeque();
   private final goz i;
   private final azg j = azg.a();
   private final Int2ObjectMap<gbe<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<gbb> l = Queues.newArrayDeque();
   private final Map<ale, gbd.b> m = Maps.newHashMap();
   private final gox n;
   private final Object2IntOpenHashMap<lf> o = new Object2IntOpenHashMap();

   public gbd(fxu $$0, goz $$1) {
      this.n = new gox(gox.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(li.a, gas.a::new);
      this.a(li.c, new fzu.a());
      this.a(li.b, new gca.b());
      this.a(li.d, fzx.a::new);
      this.a(li.aq, fzw.a::new);
      this.a(li.ao, fzy.a::new);
      this.a(li.at, fzz.a::new);
      this.a(li.au, fzz.b::new);
      this.a(li.e, gbg.a::new);
      this.a(li.P, gbz.a::new);
      this.a(li.f, gab.c::new);
      this.a(li.ap, gch.a::new);
      this.a(li.g, gab.a::new);
      this.a(li.h, gac.a::new);
      this.a(li.as, gbz.b::new);
      this.a(li.i, gad::c);
      this.a(li.j, gad::d);
      this.a(li.k, gad::e);
      this.a(li.l, gad::a);
      this.a(li.m, gad::b);
      this.a(li.n, gaf.a::new);
      this.a(li.o, gae.a::new);
      this.a(li.p, gbt.c::new);
      this.a(li.q, new gay.a());
      this.a(li.r, gab.b::new);
      this.a(li.s, gao.a::new);
      this.a(li.t, gai.a::new);
      this.a(li.u, gbt.b::new);
      this.a(li.v, new gau.a());
      this.a(li.w, gat.a::new);
      this.a(li.B, gbr.a::new);
      this.a(li.C, gak.a::new);
      this.a(li.x, gaq.a::new);
      this.a(li.y, gaq.b::new);
      this.a(li.z, new gar.a(3.0, 7, 0));
      this.a(li.A, new gar.a(1.0, 3, 2));
      this.a(li.D, gal.d::new);
      this.a(li.E, gcg.a::new);
      this.a(li.F, gam.a::new);
      this.a(li.G, gbt.c::new);
      this.a(li.I, gbs.a::new);
      this.a(li.J, gbk.a::new);
      this.a(li.K, gbl.a::new);
      this.a(li.M, gbs.b::new);
      this.a(li.L, gam.a::new);
      this.a(li.N, gal.a::new);
      this.a(li.O, gbz.d::new);
      this.a(li.Q, gas.b::new);
      this.a(li.R, gbt.a::new);
      this.a(li.S, new fzv.b());
      this.a(li.U, new fzv.c());
      this.a(li.V, new fzv.a());
      this.a(li.W, new fzv.d());
      this.a(li.X, gaw.a::new);
      this.a(li.Y, gax.a::new);
      this.a(li.Z, gbz.e::new);
      this.a(li.ar, gao.b::new);
      this.a(li.aa, gba.a::new);
      this.a(li.ab, gaj.a::new);
      this.a(li.ac, gbh.a::new);
      this.a(li.ad, gci.a::new);
      this.a(li.ae, gbp.a::new);
      this.a(li.af, gck.a::new);
      this.a(li.ag, gbg.b::new);
      this.a(li.aK, gbq.a::new);
      this.a(li.ah, gbu.a::new);
      this.a(li.aj, fzs.a::new);
      this.a(li.ak, gcc.a::new);
      this.a(li.ai, gbx.b::new);
      this.a(li.al, gby.c::new);
      this.a(li.am, gbv.a::new);
      this.a(li.an, gbt.d::new);
      this.a(li.av, gad::f);
      this.a(li.aw, gad::g);
      this.a(li.ax, gad::h);
      this.a(li.ay, gad::m);
      this.a(li.az, gad::n);
      this.a(li.aD, gby.b::new);
      this.a(li.aA, fzr.a::new);
      this.a(li.aB, gby.a::new);
      this.a(li.aC, gby.d::new);
      this.a(li.aE, gad::o);
      this.a(li.aF, gad::p);
      this.a(li.aG, gad::q);
      this.a(li.aH, gbi.a::new);
      this.a(li.aI, gcj.a::new);
      this.a(li.aJ, gam.b::new);
      this.a(li.aN, gad::i);
      this.a(li.aO, gad::j);
      this.a(li.H, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new gaa($$2, $$3, $$4, $$5, $$0));
      this.a(li.aL, gad::k);
      this.a(li.aM, gad::l);
      this.a(li.T, gcf.a::new);
      this.a(li.aP, gbx.a::new);
      this.a(li.aQ, gap.b::new);
      this.a(li.aR, gap.e::new);
      this.a(li.aS, gap.d::new);
      this.a(li.aT, gap.a::new);
      this.a(li.aU, gap.c::new);
      this.a(li.aV, gbm.a::new);
      this.a(li.aW, gbz.c::new);
      this.a(li.aX, gah.a::new);
      this.a(li.aY, gce.a::new);
      this.a(li.aZ, gce.a::new);
      this.a(li.ba, gao.c::new);
      this.a(li.bb, new gca.a());
      this.a(li.bd, gbt.c::new);
      this.a(li.be, gbt.c::new);
      this.a(li.bc, gan.a::new);
   }

   private <T extends lg> void a(lh<T> $$0, gbe<T> $$1) {
      this.k.put(lp.j.a($$0), $$1);
   }

   private <T extends lg> void a(lh<T> $$0, gbe.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            gcb $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends lg> void a(lh<T> $$0, gbd.c<T> $$1) {
      gbd.b $$2 = new gbd.b();
      this.m.put(lp.j.b($$0), $$2);
      this.k.put(lp.j.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(aui.a $$0, auo $$1, bnh $$2, bnh $$3, Executor $$4, Executor $$5) {
      record a(ale a, Optional<List<ale>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<ale, aum>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            ale $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ac.d($$2x);
      });
      CompletableFuture<got.a> $$7 = got.a(this.n).a($$1, d, 0, $$4).thenCompose(got.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         got.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<ale> $$5x = new HashSet<>();
         goy $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<ale>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<goy> $$5xx = new ArrayList<>();

               for (ale $$6xx : $$4xx.get()) {
                  goy $$7x = $$4x.f().get($$6xx);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(ale::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<ale>> a(ale $$0, aum $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               gbc $$3 = gbc.a(ayo.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bst $$0, lg $$1) {
      this.h.add(new gcd(this.a, $$0, $$1));
   }

   public void a(bst $$0, lg $$1, int $$2) {
      this.h.add(new gcd(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public gbb a(lg $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gbb $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends lg> gbb b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gbe<T> $$7 = (gbe<T>)this.k.get(lp.j.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(gbb $$0) {
      Optional<lf> $$1 = $$0.o();
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
         List<gcd> $$0 = Lists.newArrayList();

         for (gcd $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      gbb $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<gbb> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<gbb> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            gbb $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(lf $$0, int $$1) {
      this.o.addTo($$0, $$1);
   }

   private void b(gbb $$0) {
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

   public void a(gdm $$0, fep $$1, float $$2) {
      $$0.c();
      RenderSystem.enableDepthTest();

      for (gbf $$3 : f) {
         Iterable<gbb> $$4 = this.g.get($$3);
         if ($$4 != null) {
            RenderSystem.setShader(gdg::t);
            ezz $$5 = ezz.b();
            ezs $$6 = $$5.d();
            $$3.a($$6, this.i);

            for (gbb $$7 : $$4) {
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

   public void a(@Nullable fxu $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(iz $$0, dsb $$1) {
      if (!$$1.i() && $$1.z()) {
         ewj $$2 = $$1.j(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, ayy.c($$8 / 0.25));
               int $$12 = Math.max(2, ayy.c($$9 / 0.25));
               int $$13 = Math.max(2, ayy.c($$10 / 0.25));

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
                           new gca(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(iz $$0, je $$1) {
      dsb $$2 = this.a.a_($$0);
      if ($$2.l() != dle.a && $$2.z()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         evl $$7 = $$2.j(this.a, $$0).a();
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

         this.a(new gca(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(lf $$0) {
      return this.o.getInt($$0) < $$0.a();
   }

   private void f() {
      this.g.clear();
      this.l.clear();
      this.h.clear();
      this.o.clear();
   }

   static class b implements gbw {
      private List<goy> a;

      @Override
      public goy a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public goy a(azg $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<goy> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends lg> {
      gbe<T> create(gbw var1);
   }
}
