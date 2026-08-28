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

public class ggq implements auw {
   private static final Logger b = LogUtils.getLogger();
   private static final alc c = alc.a("particles");
   private static final alj d = alj.b("particles");
   private static final int e = 16384;
   private static final List<ggs> f = ImmutableList.of(ggs.a, ggs.b, ggs.c, ggs.d);
   protected gdh a;
   private final Map<ggs, Queue<ggo>> g = Maps.newIdentityHashMap();
   private final Queue<ghq> h = Queues.newArrayDeque();
   private final gzf i;
   private final azu j = azu.a();
   private final Int2ObjectMap<ggr<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<ggo> l = Queues.newArrayDeque();
   private final Map<alj, ggq.b> m = Maps.newHashMap();
   private final gzd n;
   private final Object2IntOpenHashMap<lp> o = new Object2IntOpenHashMap();

   public ggq(gdh $$0, gzf $$1) {
      this.n = new gzd(gzd.e);
      $$1.a(this.n.h(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(ls.a, ggf.a::new);
      this.a(ls.c, new gfh.a());
      this.a(ls.b, new ghn.b());
      this.a(ls.d, gfk.a::new);
      this.a(ls.aq, gfj.a::new);
      this.a(ls.ao, gfl.a::new);
      this.a(ls.at, gfm.a::new);
      this.a(ls.au, gfm.b::new);
      this.a(ls.e, ggt.a::new);
      this.a(ls.P, ghm.a::new);
      this.a(ls.f, gfo.c::new);
      this.a(ls.ap, ghu.a::new);
      this.a(ls.g, gfo.a::new);
      this.a(ls.h, gfp.a::new);
      this.a(ls.as, ghm.b::new);
      this.a(ls.i, gfq::c);
      this.a(ls.j, gfq::d);
      this.a(ls.k, gfq::e);
      this.a(ls.l, gfq::a);
      this.a(ls.m, gfq::b);
      this.a(ls.n, gfs.a::new);
      this.a(ls.o, gfr.a::new);
      this.a(ls.p, ghg.c::new);
      this.a(ls.q, new ggl.a());
      this.a(ls.r, gfo.b::new);
      this.a(ls.s, ggb.a::new);
      this.a(ls.t, gfv.a::new);
      this.a(ls.u, ghg.b::new);
      this.a(ls.v, new ggh.a());
      this.a(ls.w, ggg.a::new);
      this.a(ls.B, ghe.a::new);
      this.a(ls.C, gfx.a::new);
      this.a(ls.x, ggd.a::new);
      this.a(ls.y, ggd.b::new);
      this.a(ls.z, new gge.a(3.0, 7, 0));
      this.a(ls.A, new gge.a(1.0, 3, 2));
      this.a(ls.D, gfy.d::new);
      this.a(ls.E, ght.a::new);
      this.a(ls.F, gfz.a::new);
      this.a(ls.G, ghg.c::new);
      this.a(ls.I, ghf.a::new);
      this.a(ls.J, ggx.a::new);
      this.a(ls.K, ggy.a::new);
      this.a(ls.M, ghf.b::new);
      this.a(ls.L, gfz.a::new);
      this.a(ls.N, gfy.a::new);
      this.a(ls.O, ghm.d::new);
      this.a(ls.Q, ggf.b::new);
      this.a(ls.R, ghg.a::new);
      this.a(ls.S, new gfi.b());
      this.a(ls.U, new gfi.c());
      this.a(ls.V, new gfi.a());
      this.a(ls.W, new gfi.d());
      this.a(ls.X, ggj.a::new);
      this.a(ls.Y, ggk.a::new);
      this.a(ls.Z, ghm.e::new);
      this.a(ls.ar, ggb.b::new);
      this.a(ls.aa, ggn.a::new);
      this.a(ls.ab, gfw.a::new);
      this.a(ls.ac, ggu.a::new);
      this.a(ls.ad, ghv.a::new);
      this.a(ls.ae, ghc.a::new);
      this.a(ls.af, ghx.a::new);
      this.a(ls.ag, ggt.b::new);
      this.a(ls.aK, ghd.a::new);
      this.a(ls.ah, ghh.a::new);
      this.a(ls.aj, gff.a::new);
      this.a(ls.ak, ghp.a::new);
      this.a(ls.ai, ghk.b::new);
      this.a(ls.al, ghl.c::new);
      this.a(ls.am, ghi.a::new);
      this.a(ls.an, ghg.d::new);
      this.a(ls.av, gfq::f);
      this.a(ls.aw, gfq::g);
      this.a(ls.ax, gfq::h);
      this.a(ls.ay, gfq::m);
      this.a(ls.az, gfq::n);
      this.a(ls.aD, ghl.b::new);
      this.a(ls.aA, gfe.a::new);
      this.a(ls.aB, ghl.a::new);
      this.a(ls.aC, ghl.d::new);
      this.a(ls.aE, gfq::o);
      this.a(ls.aF, gfq::p);
      this.a(ls.aG, gfq::q);
      this.a(ls.aH, ggv.a::new);
      this.a(ls.aI, ghw.a::new);
      this.a(ls.aJ, gfz.b::new);
      this.a(ls.aN, gfq::i);
      this.a(ls.aO, gfq::j);
      this.a(ls.H, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new gfn($$2, $$3, $$4, $$5, $$0));
      this.a(ls.aL, gfq::k);
      this.a(ls.aM, gfq::l);
      this.a(ls.T, ghs.a::new);
      this.a(ls.aP, ghk.a::new);
      this.a(ls.aQ, ggc.b::new);
      this.a(ls.aR, ggc.e::new);
      this.a(ls.aS, ggc.d::new);
      this.a(ls.aT, ggc.a::new);
      this.a(ls.aU, ggc.c::new);
      this.a(ls.aV, ggz.a::new);
      this.a(ls.aW, ghm.c::new);
      this.a(ls.aX, gfu.a::new);
      this.a(ls.aY, ghr.a::new);
      this.a(ls.aZ, ghr.a::new);
      this.a(ls.ba, ggb.c::new);
      this.a(ls.bb, new ghn.a());
      this.a(ls.bd, ghg.c::new);
      this.a(ls.be, ghg.c::new);
      this.a(ls.bc, gga.a::new);
   }

   private <T extends lq> void a(lr<T> $$0, ggr<T> $$1) {
      this.k.put(lz.i.a($$0), $$1);
   }

   private <T extends lq> void a(lr<T> $$0, ggr.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            gho $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends lq> void a(lr<T> $$0, ggq.c<T> $$1) {
      ggq.b $$2 = new ggq.b();
      this.m.put(lz.i.b($$0), $$2);
      this.k.put(lz.i.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(auw.a $$0, avd $$1, Executor $$2, Executor $$3) {
      record a(alj a, Optional<List<alj>> b) {
      }

      CompletableFuture<List<a>> $$4 = CompletableFuture.<Map<alj, avb>>supplyAsync(() -> c.a($$1), $$2).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            alj $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$2));
         });
         return ae.d($$2x);
      });
      CompletableFuture<gyz.a> $$5 = gyz.a(this.n).a($$1, d, 0, $$2).thenCompose(gyz.a::a);
      return CompletableFuture.allOf($$5, $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> {
         this.f();
         bou $$3x = bot.a();
         $$3x.a("upload");
         gyz.a $$4x = $$5.join();
         this.n.a($$4x);
         $$3x.b("bindSpriteSets");
         Set<alj> $$5x = new HashSet<>();
         gze $$6 = $$4x.e();
         $$4.join().forEach($$3xx -> {
            Optional<List<alj>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<gze> $$5xx = new ArrayList<>();

               for (alj $$6x : $$4xx.get()) {
                  gze $$7 = $$4x.f().get($$6x);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(alj::toString).collect(Collectors.joining(",")));
         }

         $$3x.c();
      }, $$3);
   }

   public void a() {
      this.n.g();
   }

   private Optional<List<alj>> a(alj $$0, avb $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               ggp $$3 = ggp.a(azc.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bul $$0, lq $$1) {
      this.h.add(new ghq(this.a, $$0, $$1));
   }

   public void a(bul $$0, lq $$1, int $$2) {
      this.h.add(new ghq(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public ggo a(lq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      ggo $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends lq> ggo b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      ggr<T> $$7 = (ggr<T>)this.k.get(lz.i.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(ggo $$0) {
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
         bot.a().a($$0.toString());
         this.a($$1x);
         bot.a().c();
      });
      if (!this.h.isEmpty()) {
         List<ghq> $$0 = Lists.newArrayList();

         for (ghq $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      ggo $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<ggo> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<ggo> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            ggo $$2 = $$1.next();
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

   private void b(ggo $$0) {
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

   public void a(gje $$0, fjn $$1, float $$2) {
      $$0.c();
      RenderSystem.enableDepthTest();

      for (ggs $$3 : f) {
         Queue<ggo> $$4 = this.g.get($$3);
         if ($$4 != null && !$$4.isEmpty()) {
            fet $$5 = fet.b();
            fem $$6 = $$3.a($$5, this.i);
            if ($$6 != null) {
               for (ggo $$7 : $$4) {
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

               feq $$11 = $$6.a();
               if ($$11 != null) {
                  fen.a($$11);
               }
            }
         }
      }

      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      $$0.b();
   }

   public void a(@Nullable gdh $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(jh $$0, dvv $$1) {
      if (!$$1.l() && $$1.D()) {
         fas $$2 = $$1.f(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, azm.c($$8 / 0.25));
               int $$12 = Math.max(2, azm.c($$9 / 0.25));
               int $$13 = Math.max(2, azm.c($$10 / 0.25));

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
                           new ghn(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(jh $$0, jm $$1) {
      dvv $$2 = this.a.a_($$0);
      if ($$2.o() != dow.a && $$2.D()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         ezt $$7 = $$2.f(this.a, $$0).a();
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

         this.a(new ghn(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
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

   static class b implements ghj {
      private List<gze> a;

      @Override
      public gze a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public gze a(azu $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<gze> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends lq> {
      ggr<T> create(ghj var1);
   }
}
