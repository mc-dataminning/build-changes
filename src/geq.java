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

public class geq implements aun {
   private static final Logger b = LogUtils.getLogger();
   private static final akv c = akv.a("particles");
   private static final alc d = alc.b("particles");
   private static final int e = 16384;
   private static final List<ges> f = ImmutableList.of(ges.a, ges.b, ges.c, ges.d);
   protected gbh a;
   private final Map<ges, Queue<geo>> g = Maps.newIdentityHashMap();
   private final Queue<gfq> h = Queues.newArrayDeque();
   private final gxc i;
   private final azl j = azl.a();
   private final Int2ObjectMap<ger<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<geo> l = Queues.newArrayDeque();
   private final Map<alc, geq.b> m = Maps.newHashMap();
   private final gxa n;
   private final Object2IntOpenHashMap<lk> o = new Object2IntOpenHashMap();

   public geq(gbh $$0, gxc $$1) {
      this.n = new gxa(gxa.e);
      $$1.a(this.n.h(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(ln.a, gef.a::new);
      this.a(ln.c, new gdh.a());
      this.a(ln.b, new gfn.b());
      this.a(ln.d, gdk.a::new);
      this.a(ln.aq, gdj.a::new);
      this.a(ln.ao, gdl.a::new);
      this.a(ln.at, gdm.a::new);
      this.a(ln.au, gdm.b::new);
      this.a(ln.e, get.a::new);
      this.a(ln.P, gfm.a::new);
      this.a(ln.f, gdo.c::new);
      this.a(ln.ap, gfu.a::new);
      this.a(ln.g, gdo.a::new);
      this.a(ln.h, gdp.a::new);
      this.a(ln.as, gfm.b::new);
      this.a(ln.i, gdq::c);
      this.a(ln.j, gdq::d);
      this.a(ln.k, gdq::e);
      this.a(ln.l, gdq::a);
      this.a(ln.m, gdq::b);
      this.a(ln.n, gds.a::new);
      this.a(ln.o, gdr.a::new);
      this.a(ln.p, gfg.c::new);
      this.a(ln.q, new gel.a());
      this.a(ln.r, gdo.b::new);
      this.a(ln.s, geb.a::new);
      this.a(ln.t, gdv.a::new);
      this.a(ln.u, gfg.b::new);
      this.a(ln.v, new geh.a());
      this.a(ln.w, geg.a::new);
      this.a(ln.B, gfe.a::new);
      this.a(ln.C, gdx.a::new);
      this.a(ln.x, ged.a::new);
      this.a(ln.y, ged.b::new);
      this.a(ln.z, new gee.a(3.0, 7, 0));
      this.a(ln.A, new gee.a(1.0, 3, 2));
      this.a(ln.D, gdy.d::new);
      this.a(ln.E, gft.a::new);
      this.a(ln.F, gdz.a::new);
      this.a(ln.G, gfg.c::new);
      this.a(ln.I, gff.a::new);
      this.a(ln.J, gex.a::new);
      this.a(ln.K, gey.a::new);
      this.a(ln.M, gff.b::new);
      this.a(ln.L, gdz.a::new);
      this.a(ln.N, gdy.a::new);
      this.a(ln.O, gfm.d::new);
      this.a(ln.Q, gef.b::new);
      this.a(ln.R, gfg.a::new);
      this.a(ln.S, new gdi.b());
      this.a(ln.U, new gdi.c());
      this.a(ln.V, new gdi.a());
      this.a(ln.W, new gdi.d());
      this.a(ln.X, gej.a::new);
      this.a(ln.Y, gek.a::new);
      this.a(ln.Z, gfm.e::new);
      this.a(ln.ar, geb.b::new);
      this.a(ln.aa, gen.a::new);
      this.a(ln.ab, gdw.a::new);
      this.a(ln.ac, geu.a::new);
      this.a(ln.ad, gfv.a::new);
      this.a(ln.ae, gfc.a::new);
      this.a(ln.af, gfx.a::new);
      this.a(ln.ag, get.b::new);
      this.a(ln.aK, gfd.a::new);
      this.a(ln.ah, gfh.a::new);
      this.a(ln.aj, gdf.a::new);
      this.a(ln.ak, gfp.a::new);
      this.a(ln.ai, gfk.b::new);
      this.a(ln.al, gfl.c::new);
      this.a(ln.am, gfi.a::new);
      this.a(ln.an, gfg.d::new);
      this.a(ln.av, gdq::f);
      this.a(ln.aw, gdq::g);
      this.a(ln.ax, gdq::h);
      this.a(ln.ay, gdq::m);
      this.a(ln.az, gdq::n);
      this.a(ln.aD, gfl.b::new);
      this.a(ln.aA, gde.a::new);
      this.a(ln.aB, gfl.a::new);
      this.a(ln.aC, gfl.d::new);
      this.a(ln.aE, gdq::o);
      this.a(ln.aF, gdq::p);
      this.a(ln.aG, gdq::q);
      this.a(ln.aH, gev.a::new);
      this.a(ln.aI, gfw.a::new);
      this.a(ln.aJ, gdz.b::new);
      this.a(ln.aN, gdq::i);
      this.a(ln.aO, gdq::j);
      this.a(ln.H, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new gdn($$2, $$3, $$4, $$5, $$0));
      this.a(ln.aL, gdq::k);
      this.a(ln.aM, gdq::l);
      this.a(ln.T, gfs.a::new);
      this.a(ln.aP, gfk.a::new);
      this.a(ln.aQ, gec.b::new);
      this.a(ln.aR, gec.e::new);
      this.a(ln.aS, gec.d::new);
      this.a(ln.aT, gec.a::new);
      this.a(ln.aU, gec.c::new);
      this.a(ln.aV, gez.a::new);
      this.a(ln.aW, gfm.c::new);
      this.a(ln.aX, gdu.a::new);
      this.a(ln.aY, gfr.a::new);
      this.a(ln.aZ, gfr.a::new);
      this.a(ln.ba, geb.c::new);
      this.a(ln.bb, new gfn.a());
      this.a(ln.bd, gfg.c::new);
      this.a(ln.be, gfg.c::new);
      this.a(ln.bc, gea.a::new);
   }

   private <T extends ll> void a(lm<T> $$0, ger<T> $$1) {
      this.k.put(lu.i.a($$0), $$1);
   }

   private <T extends ll> void a(lm<T> $$0, ger.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            gfo $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends ll> void a(lm<T> $$0, geq.c<T> $$1) {
      geq.b $$2 = new geq.b();
      this.m.put(lu.i.b($$0), $$2);
      this.k.put(lu.i.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(aun.a $$0, aut $$1, bod $$2, bod $$3, Executor $$4, Executor $$5) {
      record a(alc a, Optional<List<alc>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<alc, aur>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            alc $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ad.d($$2x);
      });
      CompletableFuture<gww.a> $$7 = gww.a(this.n).a($$1, d, 0, $$4).thenCompose(gww.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         gww.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<alc> $$5x = new HashSet<>();
         gxb $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<alc>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<gxb> $$5xx = new ArrayList<>();

               for (alc $$6xx : $$4xx.get()) {
                  gxb $$7x = $$4x.f().get($$6xx);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(alc::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.g();
   }

   private Optional<List<alc>> a(alc $$0, aur $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               gep $$3 = gep.a(ayt.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bto $$0, ll $$1) {
      this.h.add(new gfq(this.a, $$0, $$1));
   }

   public void a(bto $$0, ll $$1, int $$2) {
      this.h.add(new gfq(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public geo a(ll $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      geo $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends ll> geo b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      ger<T> $$7 = (ger<T>)this.k.get(lu.i.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(geo $$0) {
      Optional<lk> $$1 = $$0.o();
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
         List<gfq> $$0 = Lists.newArrayList();

         for (gfq $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      geo $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<geo> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<geo> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            geo $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(lk $$0, int $$1) {
      this.o.addTo($$0, $$1);
   }

   private void b(geo $$0) {
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

   public void a(ghe $$0, fhu $$1, float $$2) {
      $$0.c();
      RenderSystem.enableDepthTest();

      for (ges $$3 : f) {
         Queue<geo> $$4 = this.g.get($$3);
         if ($$4 != null && !$$4.isEmpty()) {
            fdg $$5 = fdg.b();
            fcz $$6 = $$3.a($$5, this.i);
            if ($$6 != null) {
               for (geo $$7 : $$4) {
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

               fdd $$11 = $$6.a();
               if ($$11 != null) {
                  fda.a($$11);
               }
            }
         }
      }

      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      $$0.b();
   }

   public void a(@Nullable gbh $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(je $$0, duo $$1) {
      if (!$$1.l() && $$1.D()) {
         ezm $$2 = $$1.f(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, azd.c($$8 / 0.25));
               int $$12 = Math.max(2, azd.c($$9 / 0.25));
               int $$13 = Math.max(2, azd.c($$10 / 0.25));

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
                           new gfn(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(je $$0, jj $$1) {
      duo $$2 = this.a.a_($$0);
      if ($$2.o() != dnq.a && $$2.D()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         eyn $$7 = $$2.f(this.a, $$0).a();
         double $$8 = (double)$$3 + this.j.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.j.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.j.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == jj.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == jj.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == jj.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == jj.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == jj.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == jj.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new gfn(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(lk $$0) {
      return this.o.getInt($$0) < $$0.a();
   }

   private void f() {
      this.g.clear();
      this.l.clear();
      this.h.clear();
      this.o.clear();
   }

   static class b implements gfj {
      private List<gxb> a;

      @Override
      public gxb a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public gxb a(azl $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<gxb> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends ll> {
      ger<T> create(gfj var1);
   }
}
