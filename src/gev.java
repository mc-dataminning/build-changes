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

public class gev implements aup {
   private static final Logger b = LogUtils.getLogger();
   private static final akx c = akx.a("particles");
   private static final ale d = ale.b("particles");
   private static final int e = 16384;
   private static final List<gex> f = ImmutableList.of(gex.a, gex.b, gex.c, gex.d);
   protected gbm a;
   private final Map<gex, Queue<get>> g = Maps.newIdentityHashMap();
   private final Queue<gfv> h = Queues.newArrayDeque();
   private final gxh i;
   private final azn j = azn.a();
   private final Int2ObjectMap<gew<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<get> l = Queues.newArrayDeque();
   private final Map<ale, gev.b> m = Maps.newHashMap();
   private final gxf n;
   private final Object2IntOpenHashMap<ll> o = new Object2IntOpenHashMap();

   public gev(gbm $$0, gxh $$1) {
      this.n = new gxf(gxf.e);
      $$1.a(this.n.h(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(lo.a, gek.a::new);
      this.a(lo.c, new gdm.a());
      this.a(lo.b, new gfs.b());
      this.a(lo.d, gdp.a::new);
      this.a(lo.aq, gdo.a::new);
      this.a(lo.ao, gdq.a::new);
      this.a(lo.at, gdr.a::new);
      this.a(lo.au, gdr.b::new);
      this.a(lo.e, gey.a::new);
      this.a(lo.P, gfr.a::new);
      this.a(lo.f, gdt.c::new);
      this.a(lo.ap, gfz.a::new);
      this.a(lo.g, gdt.a::new);
      this.a(lo.h, gdu.a::new);
      this.a(lo.as, gfr.b::new);
      this.a(lo.i, gdv::c);
      this.a(lo.j, gdv::d);
      this.a(lo.k, gdv::e);
      this.a(lo.l, gdv::a);
      this.a(lo.m, gdv::b);
      this.a(lo.n, gdx.a::new);
      this.a(lo.o, gdw.a::new);
      this.a(lo.p, gfl.c::new);
      this.a(lo.q, new geq.a());
      this.a(lo.r, gdt.b::new);
      this.a(lo.s, geg.a::new);
      this.a(lo.t, gea.a::new);
      this.a(lo.u, gfl.b::new);
      this.a(lo.v, new gem.a());
      this.a(lo.w, gel.a::new);
      this.a(lo.B, gfj.a::new);
      this.a(lo.C, gec.a::new);
      this.a(lo.x, gei.a::new);
      this.a(lo.y, gei.b::new);
      this.a(lo.z, new gej.a(3.0, 7, 0));
      this.a(lo.A, new gej.a(1.0, 3, 2));
      this.a(lo.D, ged.d::new);
      this.a(lo.E, gfy.a::new);
      this.a(lo.F, gee.a::new);
      this.a(lo.G, gfl.c::new);
      this.a(lo.I, gfk.a::new);
      this.a(lo.J, gfc.a::new);
      this.a(lo.K, gfd.a::new);
      this.a(lo.M, gfk.b::new);
      this.a(lo.L, gee.a::new);
      this.a(lo.N, ged.a::new);
      this.a(lo.O, gfr.d::new);
      this.a(lo.Q, gek.b::new);
      this.a(lo.R, gfl.a::new);
      this.a(lo.S, new gdn.b());
      this.a(lo.U, new gdn.c());
      this.a(lo.V, new gdn.a());
      this.a(lo.W, new gdn.d());
      this.a(lo.X, geo.a::new);
      this.a(lo.Y, gep.a::new);
      this.a(lo.Z, gfr.e::new);
      this.a(lo.ar, geg.b::new);
      this.a(lo.aa, ges.a::new);
      this.a(lo.ab, geb.a::new);
      this.a(lo.ac, gez.a::new);
      this.a(lo.ad, gga.a::new);
      this.a(lo.ae, gfh.a::new);
      this.a(lo.af, ggc.a::new);
      this.a(lo.ag, gey.b::new);
      this.a(lo.aK, gfi.a::new);
      this.a(lo.ah, gfm.a::new);
      this.a(lo.aj, gdk.a::new);
      this.a(lo.ak, gfu.a::new);
      this.a(lo.ai, gfp.b::new);
      this.a(lo.al, gfq.c::new);
      this.a(lo.am, gfn.a::new);
      this.a(lo.an, gfl.d::new);
      this.a(lo.av, gdv::f);
      this.a(lo.aw, gdv::g);
      this.a(lo.ax, gdv::h);
      this.a(lo.ay, gdv::m);
      this.a(lo.az, gdv::n);
      this.a(lo.aD, gfq.b::new);
      this.a(lo.aA, gdj.a::new);
      this.a(lo.aB, gfq.a::new);
      this.a(lo.aC, gfq.d::new);
      this.a(lo.aE, gdv::o);
      this.a(lo.aF, gdv::p);
      this.a(lo.aG, gdv::q);
      this.a(lo.aH, gfa.a::new);
      this.a(lo.aI, ggb.a::new);
      this.a(lo.aJ, gee.b::new);
      this.a(lo.aN, gdv::i);
      this.a(lo.aO, gdv::j);
      this.a(lo.H, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new gds($$2, $$3, $$4, $$5, $$0));
      this.a(lo.aL, gdv::k);
      this.a(lo.aM, gdv::l);
      this.a(lo.T, gfx.a::new);
      this.a(lo.aP, gfp.a::new);
      this.a(lo.aQ, geh.b::new);
      this.a(lo.aR, geh.e::new);
      this.a(lo.aS, geh.d::new);
      this.a(lo.aT, geh.a::new);
      this.a(lo.aU, geh.c::new);
      this.a(lo.aV, gfe.a::new);
      this.a(lo.aW, gfr.c::new);
      this.a(lo.aX, gdz.a::new);
      this.a(lo.aY, gfw.a::new);
      this.a(lo.aZ, gfw.a::new);
      this.a(lo.ba, geg.c::new);
      this.a(lo.bb, new gfs.a());
      this.a(lo.bd, gfl.c::new);
      this.a(lo.be, gfl.c::new);
      this.a(lo.bc, gef.a::new);
   }

   private <T extends lm> void a(ln<T> $$0, gew<T> $$1) {
      this.k.put(lv.i.a($$0), $$1);
   }

   private <T extends lm> void a(ln<T> $$0, gew.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            gft $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends lm> void a(ln<T> $$0, gev.c<T> $$1) {
      gev.b $$2 = new gev.b();
      this.m.put(lv.i.b($$0), $$2);
      this.k.put(lv.i.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(aup.a $$0, auv $$1, bog $$2, bog $$3, Executor $$4, Executor $$5) {
      record a(ale a, Optional<List<ale>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<ale, aut>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            ale $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ad.d($$2x);
      });
      CompletableFuture<gxb.a> $$7 = gxb.a(this.n).a($$1, d, 0, $$4).thenCompose(gxb.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         gxb.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<ale> $$5x = new HashSet<>();
         gxg $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<ale>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<gxg> $$5xx = new ArrayList<>();

               for (ale $$6xx : $$4xx.get()) {
                  gxg $$7x = $$4x.f().get($$6xx);
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
      this.n.g();
   }

   private Optional<List<ale>> a(ale $$0, aut $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               geu $$3 = geu.a(ayv.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(btr $$0, lm $$1) {
      this.h.add(new gfv(this.a, $$0, $$1));
   }

   public void a(btr $$0, lm $$1, int $$2) {
      this.h.add(new gfv(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public get a(lm $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      get $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends lm> get b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gew<T> $$7 = (gew<T>)this.k.get(lv.i.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(get $$0) {
      Optional<ll> $$1 = $$0.o();
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
         List<gfv> $$0 = Lists.newArrayList();

         for (gfv $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      get $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<get> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<get> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            get $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(ll $$0, int $$1) {
      this.o.addTo($$0, $$1);
   }

   private void b(get $$0) {
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

   public void a(ghj $$0, fhy $$1, float $$2) {
      $$0.c();
      RenderSystem.enableDepthTest();

      for (gex $$3 : f) {
         Queue<get> $$4 = this.g.get($$3);
         if ($$4 != null && !$$4.isEmpty()) {
            fdk $$5 = fdk.b();
            fdd $$6 = $$3.a($$5, this.i);
            if ($$6 != null) {
               for (get $$7 : $$4) {
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

               fdh $$11 = $$6.a();
               if ($$11 != null) {
                  fde.a($$11);
               }
            }
         }
      }

      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      $$0.b();
   }

   public void a(@Nullable gbm $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(jf $$0, dus $$1) {
      if (!$$1.l() && $$1.D()) {
         ezq $$2 = $$1.f(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, azf.c($$8 / 0.25));
               int $$12 = Math.max(2, azf.c($$9 / 0.25));
               int $$13 = Math.max(2, azf.c($$10 / 0.25));

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
                           new gfs(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(jf $$0, jk $$1) {
      dus $$2 = this.a.a_($$0);
      if ($$2.o() != dnt.a && $$2.D()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         eyr $$7 = $$2.f(this.a, $$0).a();
         double $$8 = (double)$$3 + this.j.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.j.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.j.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == jk.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == jk.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == jk.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == jk.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == jk.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == jk.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new gfs(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(ll $$0) {
      return this.o.getInt($$0) < $$0.a();
   }

   private void f() {
      this.g.clear();
      this.l.clear();
      this.h.clear();
      this.o.clear();
   }

   static class b implements gfo {
      private List<gxg> a;

      @Override
      public gxg a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public gxg a(azn $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<gxg> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends lm> {
      gew<T> create(gfo var1);
   }
}
