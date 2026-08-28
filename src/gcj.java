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

public class gcj implements atx {
   private static final Logger b = LogUtils.getLogger();
   private static final akj c = akj.a("particles");
   private static final akq d = akq.b("particles");
   private static final int e = 16384;
   private static final List<gcl> f = ImmutableList.of(gcl.a, gcl.b, gcl.d, gcl.c, gcl.e);
   protected fyz a;
   private final Map<gcl, Queue<gch>> g = Maps.newIdentityHashMap();
   private final Queue<gdj> h = Queues.newArrayDeque();
   private final gqg i;
   private final ayv j = ayv.a();
   private final Int2ObjectMap<gck<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<gch> l = Queues.newArrayDeque();
   private final Map<akq, gcj.b> m = Maps.newHashMap();
   private final gqe n;
   private final Object2IntOpenHashMap<lj> o = new Object2IntOpenHashMap();

   public gcj(fyz $$0, gqg $$1) {
      this.n = new gqe(gqe.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(lm.a, gby.a::new);
      this.a(lm.c, new gba.a());
      this.a(lm.b, new gdg.b());
      this.a(lm.d, gbd.a::new);
      this.a(lm.aq, gbc.a::new);
      this.a(lm.ao, gbe.a::new);
      this.a(lm.at, gbf.a::new);
      this.a(lm.au, gbf.b::new);
      this.a(lm.e, gcm.a::new);
      this.a(lm.P, gdf.a::new);
      this.a(lm.f, gbh.c::new);
      this.a(lm.ap, gdn.a::new);
      this.a(lm.g, gbh.a::new);
      this.a(lm.h, gbi.a::new);
      this.a(lm.as, gdf.b::new);
      this.a(lm.i, gbj::c);
      this.a(lm.j, gbj::d);
      this.a(lm.k, gbj::e);
      this.a(lm.l, gbj::a);
      this.a(lm.m, gbj::b);
      this.a(lm.n, gbl.a::new);
      this.a(lm.o, gbk.a::new);
      this.a(lm.p, gcz.c::new);
      this.a(lm.q, new gce.a());
      this.a(lm.r, gbh.b::new);
      this.a(lm.s, gbu.a::new);
      this.a(lm.t, gbo.a::new);
      this.a(lm.u, gcz.b::new);
      this.a(lm.v, new gca.a());
      this.a(lm.w, gbz.a::new);
      this.a(lm.B, gcx.a::new);
      this.a(lm.C, gbq.a::new);
      this.a(lm.x, gbw.a::new);
      this.a(lm.y, gbw.b::new);
      this.a(lm.z, new gbx.a(3.0, 7, 0));
      this.a(lm.A, new gbx.a(1.0, 3, 2));
      this.a(lm.D, gbr.d::new);
      this.a(lm.E, gdm.a::new);
      this.a(lm.F, gbs.a::new);
      this.a(lm.G, gcz.c::new);
      this.a(lm.I, gcy.a::new);
      this.a(lm.J, gcq.a::new);
      this.a(lm.K, gcr.a::new);
      this.a(lm.M, gcy.b::new);
      this.a(lm.L, gbs.a::new);
      this.a(lm.N, gbr.a::new);
      this.a(lm.O, gdf.d::new);
      this.a(lm.Q, gby.b::new);
      this.a(lm.R, gcz.a::new);
      this.a(lm.S, new gbb.b());
      this.a(lm.U, new gbb.c());
      this.a(lm.V, new gbb.a());
      this.a(lm.W, new gbb.d());
      this.a(lm.X, gcc.a::new);
      this.a(lm.Y, gcd.a::new);
      this.a(lm.Z, gdf.e::new);
      this.a(lm.ar, gbu.b::new);
      this.a(lm.aa, gcg.a::new);
      this.a(lm.ab, gbp.a::new);
      this.a(lm.ac, gcn.a::new);
      this.a(lm.ad, gdo.a::new);
      this.a(lm.ae, gcv.a::new);
      this.a(lm.af, gdq.a::new);
      this.a(lm.ag, gcm.b::new);
      this.a(lm.aK, gcw.a::new);
      this.a(lm.ah, gda.a::new);
      this.a(lm.aj, gay.a::new);
      this.a(lm.ak, gdi.a::new);
      this.a(lm.ai, gdd.b::new);
      this.a(lm.al, gde.c::new);
      this.a(lm.am, gdb.a::new);
      this.a(lm.an, gcz.d::new);
      this.a(lm.av, gbj::f);
      this.a(lm.aw, gbj::g);
      this.a(lm.ax, gbj::h);
      this.a(lm.ay, gbj::m);
      this.a(lm.az, gbj::n);
      this.a(lm.aD, gde.b::new);
      this.a(lm.aA, gax.a::new);
      this.a(lm.aB, gde.a::new);
      this.a(lm.aC, gde.d::new);
      this.a(lm.aE, gbj::o);
      this.a(lm.aF, gbj::p);
      this.a(lm.aG, gbj::q);
      this.a(lm.aH, gco.a::new);
      this.a(lm.aI, gdp.a::new);
      this.a(lm.aJ, gbs.b::new);
      this.a(lm.aN, gbj::i);
      this.a(lm.aO, gbj::j);
      this.a(lm.H, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new gbg($$2, $$3, $$4, $$5, $$0));
      this.a(lm.aL, gbj::k);
      this.a(lm.aM, gbj::l);
      this.a(lm.T, gdl.a::new);
      this.a(lm.aP, gdd.a::new);
      this.a(lm.aQ, gbv.b::new);
      this.a(lm.aR, gbv.e::new);
      this.a(lm.aS, gbv.d::new);
      this.a(lm.aT, gbv.a::new);
      this.a(lm.aU, gbv.c::new);
      this.a(lm.aV, gcs.a::new);
      this.a(lm.aW, gdf.c::new);
      this.a(lm.aX, gbn.a::new);
      this.a(lm.aY, gdk.a::new);
      this.a(lm.aZ, gdk.a::new);
      this.a(lm.ba, gbu.c::new);
      this.a(lm.bb, new gdg.a());
      this.a(lm.bd, gcz.c::new);
      this.a(lm.be, gcz.c::new);
      this.a(lm.bc, gbt.a::new);
   }

   private <T extends lk> void a(ll<T> $$0, gck<T> $$1) {
      this.k.put(lt.i.a($$0), $$1);
   }

   private <T extends lk> void a(ll<T> $$0, gck.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            gdh $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends lk> void a(ll<T> $$0, gcj.c<T> $$1) {
      gcj.b $$2 = new gcj.b();
      this.m.put(lt.i.b($$0), $$2);
      this.k.put(lt.i.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(atx.a $$0, aud $$1, bne $$2, bne $$3, Executor $$4, Executor $$5) {
      record a(akq a, Optional<List<akq>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<akq, aub>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            akq $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ad.d($$2x);
      });
      CompletableFuture<gqa.a> $$7 = gqa.a(this.n).a($$1, d, 0, $$4).thenCompose(gqa.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         gqa.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<akq> $$5x = new HashSet<>();
         gqf $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<akq>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<gqf> $$5xx = new ArrayList<>();

               for (akq $$6xx : $$4xx.get()) {
                  gqf $$7x = $$4x.f().get($$6xx);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(akq::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<akq>> a(akq $$0, aub $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               gci $$3 = gci.a(ayd.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bsq $$0, lk $$1) {
      this.h.add(new gdj(this.a, $$0, $$1));
   }

   public void a(bsq $$0, lk $$1, int $$2) {
      this.h.add(new gdj(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public gch a(lk $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gch $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends lk> gch b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gck<T> $$7 = (gck<T>)this.k.get(lt.i.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(gch $$0) {
      Optional<lj> $$1 = $$0.o();
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
         List<gdj> $$0 = Lists.newArrayList();

         for (gdj $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      gch $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<gch> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<gch> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            gch $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(lj $$0, int $$1) {
      this.o.addTo($$0, $$1);
   }

   private void b(gch $$0) {
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

   public void a(ges $$0, ffs $$1, float $$2) {
      $$0.c();
      RenderSystem.enableDepthTest();

      for (gcl $$3 : f) {
         Queue<gch> $$4 = this.g.get($$3);
         if ($$4 != null && !$$4.isEmpty()) {
            RenderSystem.setShader(gem::s);
            fbe $$5 = fbe.b();
            fax $$6 = $$3.a($$5, this.i);
            if ($$6 != null) {
               for (gch $$7 : $$4) {
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

               fbb $$11 = $$6.a();
               if ($$11 != null) {
                  fay.a($$11);
               }
            }
         }
      }

      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      $$0.b();
   }

   public void a(@Nullable fyz $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(jd $$0, dta $$1) {
      if (!$$1.i() && $$1.z()) {
         exp $$2 = $$1.j(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, ayn.c($$8 / 0.25));
               int $$12 = Math.max(2, ayn.c($$9 / 0.25));
               int $$13 = Math.max(2, ayn.c($$10 / 0.25));

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
                           new gdg(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(jd $$0, ji $$1) {
      dta $$2 = this.a.a_($$0);
      if ($$2.l() != dmd.a && $$2.z()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         ewr $$7 = $$2.j(this.a, $$0).a();
         double $$8 = (double)$$3 + this.j.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.j.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.j.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == ji.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == ji.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == ji.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == ji.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == ji.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == ji.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new gdg(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(lj $$0) {
      return this.o.getInt($$0) < $$0.a();
   }

   private void f() {
      this.g.clear();
      this.l.clear();
      this.h.clear();
      this.o.clear();
   }

   static class b implements gdc {
      private List<gqf> a;

      @Override
      public gqf a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public gqf a(ayv $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<gqf> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends lk> {
      gck<T> create(gdc var1);
   }
}
