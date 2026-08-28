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

public class ggh implements auy {
   private static final Logger b = LogUtils.getLogger();
   private static final ale c = ale.a("particles");
   private static final all d = all.b("particles");
   private static final int e = 16384;
   private static final List<ggj> f = ImmutableList.of(ggj.a, ggj.b, ggj.c, ggj.d);
   protected gcy a;
   private final Map<ggj, Queue<ggf>> g = Maps.newIdentityHashMap();
   private final Queue<ghh> h = Queues.newArrayDeque();
   private final gyu i;
   private final azv j = azv.a();
   private final Int2ObjectMap<ggi<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<ggf> l = Queues.newArrayDeque();
   private final Map<all, ggh.b> m = Maps.newHashMap();
   private final gys n;
   private final Object2IntOpenHashMap<lp> o = new Object2IntOpenHashMap();

   public ggh(gcy $$0, gyu $$1) {
      this.n = new gys(gys.e);
      $$1.a(this.n.h(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(ls.a, gfw.a::new);
      this.a(ls.c, new gey.a());
      this.a(ls.b, new ghe.b());
      this.a(ls.d, gfb.a::new);
      this.a(ls.aq, gfa.a::new);
      this.a(ls.ao, gfc.a::new);
      this.a(ls.at, gfd.a::new);
      this.a(ls.au, gfd.b::new);
      this.a(ls.e, ggk.a::new);
      this.a(ls.P, ghd.a::new);
      this.a(ls.f, gff.c::new);
      this.a(ls.ap, ghl.a::new);
      this.a(ls.g, gff.a::new);
      this.a(ls.h, gfg.a::new);
      this.a(ls.as, ghd.b::new);
      this.a(ls.i, gfh::c);
      this.a(ls.j, gfh::d);
      this.a(ls.k, gfh::e);
      this.a(ls.l, gfh::a);
      this.a(ls.m, gfh::b);
      this.a(ls.n, gfj.a::new);
      this.a(ls.o, gfi.a::new);
      this.a(ls.p, ggx.c::new);
      this.a(ls.q, new ggc.a());
      this.a(ls.r, gff.b::new);
      this.a(ls.s, gfs.a::new);
      this.a(ls.t, gfm.a::new);
      this.a(ls.u, ggx.b::new);
      this.a(ls.v, new gfy.a());
      this.a(ls.w, gfx.a::new);
      this.a(ls.B, ggv.a::new);
      this.a(ls.C, gfo.a::new);
      this.a(ls.x, gfu.a::new);
      this.a(ls.y, gfu.b::new);
      this.a(ls.z, new gfv.a(3.0, 7, 0));
      this.a(ls.A, new gfv.a(1.0, 3, 2));
      this.a(ls.D, gfp.d::new);
      this.a(ls.E, ghk.a::new);
      this.a(ls.F, gfq.a::new);
      this.a(ls.G, ggx.c::new);
      this.a(ls.I, ggw.a::new);
      this.a(ls.J, ggo.a::new);
      this.a(ls.K, ggp.a::new);
      this.a(ls.M, ggw.b::new);
      this.a(ls.L, gfq.a::new);
      this.a(ls.N, gfp.a::new);
      this.a(ls.O, ghd.d::new);
      this.a(ls.Q, gfw.b::new);
      this.a(ls.R, ggx.a::new);
      this.a(ls.S, new gez.b());
      this.a(ls.U, new gez.c());
      this.a(ls.V, new gez.a());
      this.a(ls.W, new gez.d());
      this.a(ls.X, gga.a::new);
      this.a(ls.Y, ggb.a::new);
      this.a(ls.Z, ghd.e::new);
      this.a(ls.ar, gfs.b::new);
      this.a(ls.aa, gge.a::new);
      this.a(ls.ab, gfn.a::new);
      this.a(ls.ac, ggl.a::new);
      this.a(ls.ad, ghm.a::new);
      this.a(ls.ae, ggt.a::new);
      this.a(ls.af, gho.a::new);
      this.a(ls.ag, ggk.b::new);
      this.a(ls.aK, ggu.a::new);
      this.a(ls.ah, ggy.a::new);
      this.a(ls.aj, gew.a::new);
      this.a(ls.ak, ghg.a::new);
      this.a(ls.ai, ghb.b::new);
      this.a(ls.al, ghc.c::new);
      this.a(ls.am, ggz.a::new);
      this.a(ls.an, ggx.d::new);
      this.a(ls.av, gfh::f);
      this.a(ls.aw, gfh::g);
      this.a(ls.ax, gfh::h);
      this.a(ls.ay, gfh::m);
      this.a(ls.az, gfh::n);
      this.a(ls.aD, ghc.b::new);
      this.a(ls.aA, gev.a::new);
      this.a(ls.aB, ghc.a::new);
      this.a(ls.aC, ghc.d::new);
      this.a(ls.aE, gfh::o);
      this.a(ls.aF, gfh::p);
      this.a(ls.aG, gfh::q);
      this.a(ls.aH, ggm.a::new);
      this.a(ls.aI, ghn.a::new);
      this.a(ls.aJ, gfq.b::new);
      this.a(ls.aN, gfh::i);
      this.a(ls.aO, gfh::j);
      this.a(ls.H, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new gfe($$2, $$3, $$4, $$5, $$0));
      this.a(ls.aL, gfh::k);
      this.a(ls.aM, gfh::l);
      this.a(ls.T, ghj.a::new);
      this.a(ls.aP, ghb.a::new);
      this.a(ls.aQ, gft.b::new);
      this.a(ls.aR, gft.e::new);
      this.a(ls.aS, gft.d::new);
      this.a(ls.aT, gft.a::new);
      this.a(ls.aU, gft.c::new);
      this.a(ls.aV, ggq.a::new);
      this.a(ls.aW, ghd.c::new);
      this.a(ls.aX, gfl.a::new);
      this.a(ls.aY, ghi.a::new);
      this.a(ls.aZ, ghi.a::new);
      this.a(ls.ba, gfs.c::new);
      this.a(ls.bb, new ghe.a());
      this.a(ls.bd, ggx.c::new);
      this.a(ls.be, ggx.c::new);
      this.a(ls.bc, gfr.a::new);
   }

   private <T extends lq> void a(lr<T> $$0, ggi<T> $$1) {
      this.k.put(lz.i.a($$0), $$1);
   }

   private <T extends lq> void a(lr<T> $$0, ggi.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            ghf $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends lq> void a(lr<T> $$0, ggh.c<T> $$1) {
      ggh.b $$2 = new ggh.b();
      this.m.put(lz.i.b($$0), $$2);
      this.k.put(lz.i.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(auy.a $$0, ave $$1, Executor $$2, Executor $$3) {
      record a(all a, Optional<List<all>> b) {
      }

      CompletableFuture<List<a>> $$4 = CompletableFuture.<Map<all, avc>>supplyAsync(() -> c.a($$1), $$2).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            all $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$2));
         });
         return ae.d($$2x);
      });
      CompletableFuture<gyo.a> $$5 = gyo.a(this.n).a($$1, d, 0, $$2).thenCompose(gyo.a::a);
      return CompletableFuture.allOf($$5, $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> {
         this.f();
         bor $$3x = boq.a();
         $$3x.a("upload");
         gyo.a $$4x = $$5.join();
         this.n.a($$4x);
         $$3x.b("bindSpriteSets");
         Set<all> $$5x = new HashSet<>();
         gyt $$6 = $$4x.e();
         $$4.join().forEach($$3xx -> {
            Optional<List<all>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<gyt> $$5xx = new ArrayList<>();

               for (all $$6x : $$4xx.get()) {
                  gyt $$7 = $$4x.f().get($$6x);
                  if ($$7 == null) {
                     $$5x.add($$6x);
                     $$5xx.add($$6);
                  } else {
                     $$5xx.add($$7);
                  }
               }

               if ($$5xx.isEmpty()) {
                  $$5xx.add($$6);
               }

               this.m.get($$3xx.a()).a($$5xx);
            }
         });
         if (!$$5x.isEmpty()) {
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(all::toString).collect(Collectors.joining(",")));
         }

         $$3x.c();
      }, $$3);
   }

   public void a() {
      this.n.g();
   }

   private Optional<List<all>> a(all $$0, avc $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               ggg $$3 = ggg.a(azd.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bui $$0, lq $$1) {
      this.h.add(new ghh(this.a, $$0, $$1));
   }

   public void a(bui $$0, lq $$1, int $$2) {
      this.h.add(new ghh(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public ggf a(lq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      ggf $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends lq> ggf b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      ggi<T> $$7 = (ggi<T>)this.k.get(lz.i.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(ggf $$0) {
      Optional<lp> $$1 = $$0.o();
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
         boq.a().a($$0.toString());
         this.a($$1x);
         boq.a().c();
      });
      if (!this.h.isEmpty()) {
         List<ghh> $$0 = Lists.newArrayList();

         for (ghh $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      ggf $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<ggf> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<ggf> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            ggf $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(lp $$0, int $$1) {
      this.o.addTo($$0, $$1);
   }

   private void b(ggf $$0) {
      try {
         $$0.a();
      } catch (Throwable var5) {
         o $$2 = o.a(var5, "Ticking Particle");
         p $$3 = $$2.a("Particle being ticked");
         $$3.a("Particle", $$0::toString);
         $$3.a("Particle Type", $$0.b()::toString);
         throw new z($$2);
      }
   }

   public void a(giv $$0, fjg $$1, float $$2) {
      $$0.c();
      RenderSystem.enableDepthTest();

      for (ggj $$3 : f) {
         Queue<ggf> $$4 = this.g.get($$3);
         if ($$4 != null && !$$4.isEmpty()) {
            fem $$5 = fem.b();
            fef $$6 = $$3.a($$5, this.i);
            if ($$6 != null) {
               for (ggf $$7 : $$4) {
                  try {
                     $$7.a($$6, $$1, $$2);
                  } catch (Throwable var14) {
                     o $$9 = o.a(var14, "Rendering Particle");
                     p $$10 = $$9.a("Particle being rendered");
                     $$10.a("Particle", $$7::toString);
                     $$10.a("Particle Type", $$3::toString);
                     throw new z($$9);
                  }
               }

               fej $$11 = $$6.a();
               if ($$11 != null) {
                  feg.a($$11);
               }
            }
         }
      }

      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      $$0.b();
   }

   public void a(@Nullable gcy $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(jh $$0, dvo $$1) {
      if (!$$1.l() && $$1.D()) {
         fal $$2 = $$1.f(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, azn.c($$8 / 0.25));
               int $$12 = Math.max(2, azn.c($$9 / 0.25));
               int $$13 = Math.max(2, azn.c($$10 / 0.25));

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
                           new ghe(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(jh $$0, jm $$1) {
      dvo $$2 = this.a.a_($$0);
      if ($$2.o() != dop.a && $$2.D()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         ezm $$7 = $$2.f(this.a, $$0).a();
         double $$8 = (double)$$3 + this.j.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.j.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.j.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == jm.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == jm.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == jm.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == jm.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == jm.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == jm.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new ghe(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(lp $$0) {
      return this.o.getInt($$0) < $$0.a();
   }

   private void f() {
      this.g.clear();
      this.l.clear();
      this.h.clear();
      this.o.clear();
   }

   static class b implements gha {
      private List<gyt> a;

      @Override
      public gyt a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public gyt a(azv $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<gyt> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends lq> {
      ggi<T> create(gha var1);
   }
}
