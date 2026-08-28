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

public class gfg implements aut {
   private static final Logger b = LogUtils.getLogger();
   private static final ala c = ala.a("particles");
   private static final alh d = alh.b("particles");
   private static final int e = 16384;
   private static final List<gfi> f = ImmutableList.of(gfi.a, gfi.b, gfi.c, gfi.d);
   protected gbx a;
   private final Map<gfi, Queue<gfe>> g = Maps.newIdentityHashMap();
   private final Queue<ggg> h = Queues.newArrayDeque();
   private final gxt i;
   private final azr j = azr.a();
   private final Int2ObjectMap<gfh<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<gfe> l = Queues.newArrayDeque();
   private final Map<alh, gfg.b> m = Maps.newHashMap();
   private final gxr n;
   private final Object2IntOpenHashMap<ln> o = new Object2IntOpenHashMap();

   public gfg(gbx $$0, gxt $$1) {
      this.n = new gxr(gxr.e);
      $$1.a(this.n.h(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(lq.a, gev.a::new);
      this.a(lq.c, new gdx.a());
      this.a(lq.b, new ggd.b());
      this.a(lq.d, gea.a::new);
      this.a(lq.aq, gdz.a::new);
      this.a(lq.ao, geb.a::new);
      this.a(lq.at, gec.a::new);
      this.a(lq.au, gec.b::new);
      this.a(lq.e, gfj.a::new);
      this.a(lq.P, ggc.a::new);
      this.a(lq.f, gee.c::new);
      this.a(lq.ap, ggk.a::new);
      this.a(lq.g, gee.a::new);
      this.a(lq.h, gef.a::new);
      this.a(lq.as, ggc.b::new);
      this.a(lq.i, geg::c);
      this.a(lq.j, geg::d);
      this.a(lq.k, geg::e);
      this.a(lq.l, geg::a);
      this.a(lq.m, geg::b);
      this.a(lq.n, gei.a::new);
      this.a(lq.o, geh.a::new);
      this.a(lq.p, gfw.c::new);
      this.a(lq.q, new gfb.a());
      this.a(lq.r, gee.b::new);
      this.a(lq.s, ger.a::new);
      this.a(lq.t, gel.a::new);
      this.a(lq.u, gfw.b::new);
      this.a(lq.v, new gex.a());
      this.a(lq.w, gew.a::new);
      this.a(lq.B, gfu.a::new);
      this.a(lq.C, gen.a::new);
      this.a(lq.x, get.a::new);
      this.a(lq.y, get.b::new);
      this.a(lq.z, new geu.a(3.0, 7, 0));
      this.a(lq.A, new geu.a(1.0, 3, 2));
      this.a(lq.D, geo.d::new);
      this.a(lq.E, ggj.a::new);
      this.a(lq.F, gep.a::new);
      this.a(lq.G, gfw.c::new);
      this.a(lq.I, gfv.a::new);
      this.a(lq.J, gfn.a::new);
      this.a(lq.K, gfo.a::new);
      this.a(lq.M, gfv.b::new);
      this.a(lq.L, gep.a::new);
      this.a(lq.N, geo.a::new);
      this.a(lq.O, ggc.d::new);
      this.a(lq.Q, gev.b::new);
      this.a(lq.R, gfw.a::new);
      this.a(lq.S, new gdy.b());
      this.a(lq.U, new gdy.c());
      this.a(lq.V, new gdy.a());
      this.a(lq.W, new gdy.d());
      this.a(lq.X, gez.a::new);
      this.a(lq.Y, gfa.a::new);
      this.a(lq.Z, ggc.e::new);
      this.a(lq.ar, ger.b::new);
      this.a(lq.aa, gfd.a::new);
      this.a(lq.ab, gem.a::new);
      this.a(lq.ac, gfk.a::new);
      this.a(lq.ad, ggl.a::new);
      this.a(lq.ae, gfs.a::new);
      this.a(lq.af, ggn.a::new);
      this.a(lq.ag, gfj.b::new);
      this.a(lq.aK, gft.a::new);
      this.a(lq.ah, gfx.a::new);
      this.a(lq.aj, gdv.a::new);
      this.a(lq.ak, ggf.a::new);
      this.a(lq.ai, gga.b::new);
      this.a(lq.al, ggb.c::new);
      this.a(lq.am, gfy.a::new);
      this.a(lq.an, gfw.d::new);
      this.a(lq.av, geg::f);
      this.a(lq.aw, geg::g);
      this.a(lq.ax, geg::h);
      this.a(lq.ay, geg::m);
      this.a(lq.az, geg::n);
      this.a(lq.aD, ggb.b::new);
      this.a(lq.aA, gdu.a::new);
      this.a(lq.aB, ggb.a::new);
      this.a(lq.aC, ggb.d::new);
      this.a(lq.aE, geg::o);
      this.a(lq.aF, geg::p);
      this.a(lq.aG, geg::q);
      this.a(lq.aH, gfl.a::new);
      this.a(lq.aI, ggm.a::new);
      this.a(lq.aJ, gep.b::new);
      this.a(lq.aN, geg::i);
      this.a(lq.aO, geg::j);
      this.a(lq.H, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new ged($$2, $$3, $$4, $$5, $$0));
      this.a(lq.aL, geg::k);
      this.a(lq.aM, geg::l);
      this.a(lq.T, ggi.a::new);
      this.a(lq.aP, gga.a::new);
      this.a(lq.aQ, ges.b::new);
      this.a(lq.aR, ges.e::new);
      this.a(lq.aS, ges.d::new);
      this.a(lq.aT, ges.a::new);
      this.a(lq.aU, ges.c::new);
      this.a(lq.aV, gfp.a::new);
      this.a(lq.aW, ggc.c::new);
      this.a(lq.aX, gek.a::new);
      this.a(lq.aY, ggh.a::new);
      this.a(lq.aZ, ggh.a::new);
      this.a(lq.ba, ger.c::new);
      this.a(lq.bb, new ggd.a());
      this.a(lq.bd, gfw.c::new);
      this.a(lq.be, gfw.c::new);
      this.a(lq.bc, geq.a::new);
   }

   private <T extends lo> void a(lp<T> $$0, gfh<T> $$1) {
      this.k.put(lx.i.a($$0), $$1);
   }

   private <T extends lo> void a(lp<T> $$0, gfh.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            gge $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends lo> void a(lp<T> $$0, gfg.c<T> $$1) {
      gfg.b $$2 = new gfg.b();
      this.m.put(lx.i.b($$0), $$2);
      this.k.put(lx.i.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(aut.a $$0, ava $$1, bok $$2, bok $$3, Executor $$4, Executor $$5) {
      record a(alh a, Optional<List<alh>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<alh, auy>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            alh $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ad.d($$2x);
      });
      CompletableFuture<gxn.a> $$7 = gxn.a(this.n).a($$1, d, 0, $$4).thenCompose(gxn.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         gxn.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<alh> $$5x = new HashSet<>();
         gxs $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<alh>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<gxs> $$5xx = new ArrayList<>();

               for (alh $$6xx : $$4xx.get()) {
                  gxs $$7x = $$4x.f().get($$6xx);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(alh::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.g();
   }

   private Optional<List<alh>> a(alh $$0, auy $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               gff $$3 = gff.a(ayz.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(btz $$0, lo $$1) {
      this.h.add(new ggg(this.a, $$0, $$1));
   }

   public void a(btz $$0, lo $$1, int $$2) {
      this.h.add(new ggg(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public gfe a(lo $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gfe $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends lo> gfe b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gfh<T> $$7 = (gfh<T>)this.k.get(lx.i.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(gfe $$0) {
      Optional<ln> $$1 = $$0.o();
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
         this.a.ah().a($$0.toString());
         this.a($$1x);
         this.a.ah().c();
      });
      if (!this.h.isEmpty()) {
         List<ggg> $$0 = Lists.newArrayList();

         for (ggg $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      gfe $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<gfe> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<gfe> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            gfe $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(ln $$0, int $$1) {
      this.o.addTo($$0, $$1);
   }

   private void b(gfe $$0) {
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

   public void a(ghu $$0, fij $$1, float $$2) {
      $$0.c();
      RenderSystem.enableDepthTest();

      for (gfi $$3 : f) {
         Queue<gfe> $$4 = this.g.get($$3);
         if ($$4 != null && !$$4.isEmpty()) {
            fdv $$5 = fdv.b();
            fdo $$6 = $$3.a($$5, this.i);
            if ($$6 != null) {
               for (gfe $$7 : $$4) {
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

               fds $$11 = $$6.a();
               if ($$11 != null) {
                  fdp.a($$11);
               }
            }
         }
      }

      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      $$0.b();
   }

   public void a(@Nullable gbx $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(jg $$0, dvd $$1) {
      if (!$$1.l() && $$1.D()) {
         fab $$2 = $$1.f(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, azj.c($$8 / 0.25));
               int $$12 = Math.max(2, azj.c($$9 / 0.25));
               int $$13 = Math.max(2, azj.c($$10 / 0.25));

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
                           new ggd(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(jg $$0, jl $$1) {
      dvd $$2 = this.a.a_($$0);
      if ($$2.o() != doe.a && $$2.D()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         ezc $$7 = $$2.f(this.a, $$0).a();
         double $$8 = (double)$$3 + this.j.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.j.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.j.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == jl.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == jl.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == jl.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == jl.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == jl.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == jl.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new ggd(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(ln $$0) {
      return this.o.getInt($$0) < $$0.a();
   }

   private void f() {
      this.g.clear();
      this.l.clear();
      this.h.clear();
      this.o.clear();
   }

   static class b implements gfz {
      private List<gxs> a;

      @Override
      public gxs a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public gxs a(azr $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<gxs> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends lo> {
      gfh<T> create(gfz var1);
   }
}
