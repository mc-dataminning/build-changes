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

public class gcp implements aty {
   private static final Logger b = LogUtils.getLogger();
   private static final akk c = akk.a("particles");
   private static final akr d = akr.b("particles");
   private static final int e = 16384;
   private static final List<gcr> f = ImmutableList.of(gcr.a, gcr.b, gcr.d, gcr.c, gcr.e);
   protected fzf a;
   private final Map<gcr, Queue<gcn>> g = Maps.newIdentityHashMap();
   private final Queue<gdp> h = Queues.newArrayDeque();
   private final gqm i;
   private final ayw j = ayw.a();
   private final Int2ObjectMap<gcq<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<gcn> l = Queues.newArrayDeque();
   private final Map<akr, gcp.b> m = Maps.newHashMap();
   private final gqk n;
   private final Object2IntOpenHashMap<lj> o = new Object2IntOpenHashMap();

   public gcp(fzf $$0, gqm $$1) {
      this.n = new gqk(gqk.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(lm.a, gce.a::new);
      this.a(lm.c, new gbg.a());
      this.a(lm.b, new gdm.b());
      this.a(lm.d, gbj.a::new);
      this.a(lm.aq, gbi.a::new);
      this.a(lm.ao, gbk.a::new);
      this.a(lm.at, gbl.a::new);
      this.a(lm.au, gbl.b::new);
      this.a(lm.e, gcs.a::new);
      this.a(lm.P, gdl.a::new);
      this.a(lm.f, gbn.c::new);
      this.a(lm.ap, gdt.a::new);
      this.a(lm.g, gbn.a::new);
      this.a(lm.h, gbo.a::new);
      this.a(lm.as, gdl.b::new);
      this.a(lm.i, gbp::c);
      this.a(lm.j, gbp::d);
      this.a(lm.k, gbp::e);
      this.a(lm.l, gbp::a);
      this.a(lm.m, gbp::b);
      this.a(lm.n, gbr.a::new);
      this.a(lm.o, gbq.a::new);
      this.a(lm.p, gdf.c::new);
      this.a(lm.q, new gck.a());
      this.a(lm.r, gbn.b::new);
      this.a(lm.s, gca.a::new);
      this.a(lm.t, gbu.a::new);
      this.a(lm.u, gdf.b::new);
      this.a(lm.v, new gcg.a());
      this.a(lm.w, gcf.a::new);
      this.a(lm.B, gdd.a::new);
      this.a(lm.C, gbw.a::new);
      this.a(lm.x, gcc.a::new);
      this.a(lm.y, gcc.b::new);
      this.a(lm.z, new gcd.a(3.0, 7, 0));
      this.a(lm.A, new gcd.a(1.0, 3, 2));
      this.a(lm.D, gbx.d::new);
      this.a(lm.E, gds.a::new);
      this.a(lm.F, gby.a::new);
      this.a(lm.G, gdf.c::new);
      this.a(lm.I, gde.a::new);
      this.a(lm.J, gcw.a::new);
      this.a(lm.K, gcx.a::new);
      this.a(lm.M, gde.b::new);
      this.a(lm.L, gby.a::new);
      this.a(lm.N, gbx.a::new);
      this.a(lm.O, gdl.d::new);
      this.a(lm.Q, gce.b::new);
      this.a(lm.R, gdf.a::new);
      this.a(lm.S, new gbh.b());
      this.a(lm.U, new gbh.c());
      this.a(lm.V, new gbh.a());
      this.a(lm.W, new gbh.d());
      this.a(lm.X, gci.a::new);
      this.a(lm.Y, gcj.a::new);
      this.a(lm.Z, gdl.e::new);
      this.a(lm.ar, gca.b::new);
      this.a(lm.aa, gcm.a::new);
      this.a(lm.ab, gbv.a::new);
      this.a(lm.ac, gct.a::new);
      this.a(lm.ad, gdu.a::new);
      this.a(lm.ae, gdb.a::new);
      this.a(lm.af, gdw.a::new);
      this.a(lm.ag, gcs.b::new);
      this.a(lm.aK, gdc.a::new);
      this.a(lm.ah, gdg.a::new);
      this.a(lm.aj, gbe.a::new);
      this.a(lm.ak, gdo.a::new);
      this.a(lm.ai, gdj.b::new);
      this.a(lm.al, gdk.c::new);
      this.a(lm.am, gdh.a::new);
      this.a(lm.an, gdf.d::new);
      this.a(lm.av, gbp::f);
      this.a(lm.aw, gbp::g);
      this.a(lm.ax, gbp::h);
      this.a(lm.ay, gbp::m);
      this.a(lm.az, gbp::n);
      this.a(lm.aD, gdk.b::new);
      this.a(lm.aA, gbd.a::new);
      this.a(lm.aB, gdk.a::new);
      this.a(lm.aC, gdk.d::new);
      this.a(lm.aE, gbp::o);
      this.a(lm.aF, gbp::p);
      this.a(lm.aG, gbp::q);
      this.a(lm.aH, gcu.a::new);
      this.a(lm.aI, gdv.a::new);
      this.a(lm.aJ, gby.b::new);
      this.a(lm.aN, gbp::i);
      this.a(lm.aO, gbp::j);
      this.a(lm.H, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new gbm($$2, $$3, $$4, $$5, $$0));
      this.a(lm.aL, gbp::k);
      this.a(lm.aM, gbp::l);
      this.a(lm.T, gdr.a::new);
      this.a(lm.aP, gdj.a::new);
      this.a(lm.aQ, gcb.b::new);
      this.a(lm.aR, gcb.e::new);
      this.a(lm.aS, gcb.d::new);
      this.a(lm.aT, gcb.a::new);
      this.a(lm.aU, gcb.c::new);
      this.a(lm.aV, gcy.a::new);
      this.a(lm.aW, gdl.c::new);
      this.a(lm.aX, gbt.a::new);
      this.a(lm.aY, gdq.a::new);
      this.a(lm.aZ, gdq.a::new);
      this.a(lm.ba, gca.c::new);
      this.a(lm.bb, new gdm.a());
      this.a(lm.bd, gdf.c::new);
      this.a(lm.be, gdf.c::new);
      this.a(lm.bc, gbz.a::new);
   }

   private <T extends lk> void a(ll<T> $$0, gcq<T> $$1) {
      this.k.put(lt.i.a($$0), $$1);
   }

   private <T extends lk> void a(ll<T> $$0, gcq.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            gdn $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends lk> void a(ll<T> $$0, gcp.c<T> $$1) {
      gcp.b $$2 = new gcp.b();
      this.m.put(lt.i.b($$0), $$2);
      this.k.put(lt.i.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(aty.a $$0, aue $$1, bnf $$2, bnf $$3, Executor $$4, Executor $$5) {
      record a(akr a, Optional<List<akr>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<akr, auc>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            akr $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ad.d($$2x);
      });
      CompletableFuture<gqg.a> $$7 = gqg.a(this.n).a($$1, d, 0, $$4).thenCompose(gqg.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         gqg.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<akr> $$5x = new HashSet<>();
         gql $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<akr>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<gql> $$5xx = new ArrayList<>();

               for (akr $$6xx : $$4xx.get()) {
                  gql $$7x = $$4x.f().get($$6xx);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(akr::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<akr>> a(akr $$0, auc $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               gco $$3 = gco.a(aye.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bsr $$0, lk $$1) {
      this.h.add(new gdp(this.a, $$0, $$1));
   }

   public void a(bsr $$0, lk $$1, int $$2) {
      this.h.add(new gdp(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public gcn a(lk $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gcn $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends lk> gcn b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gcq<T> $$7 = (gcq<T>)this.k.get(lt.i.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(gcn $$0) {
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
         List<gdp> $$0 = Lists.newArrayList();

         for (gdp $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      gcn $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<gcn> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<gcn> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            gcn $$2 = $$1.next();
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

   private void b(gcn $$0) {
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

   public void a(gey $$0, ffy $$1, float $$2) {
      $$0.c();
      RenderSystem.enableDepthTest();

      for (gcr $$3 : f) {
         Queue<gcn> $$4 = this.g.get($$3);
         if ($$4 != null && !$$4.isEmpty()) {
            RenderSystem.setShader(ges::s);
            fbk $$5 = fbk.b();
            fbd $$6 = $$3.a($$5, this.i);
            if ($$6 != null) {
               for (gcn $$7 : $$4) {
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

               fbh $$11 = $$6.a();
               if ($$11 != null) {
                  fbe.a($$11);
               }
            }
         }
      }

      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      $$0.b();
   }

   public void a(@Nullable fzf $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(jd $$0, dtc $$1) {
      if (!$$1.i() && $$1.z()) {
         exv $$2 = $$1.j(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, ayo.c($$8 / 0.25));
               int $$12 = Math.max(2, ayo.c($$9 / 0.25));
               int $$13 = Math.max(2, ayo.c($$10 / 0.25));

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
                           new gdm(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(jd $$0, ji $$1) {
      dtc $$2 = this.a.a_($$0);
      if ($$2.l() != dmf.a && $$2.z()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         ewx $$7 = $$2.j(this.a, $$0).a();
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

         this.a(new gdm(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
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

   static class b implements gdi {
      private List<gql> a;

      @Override
      public gql a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public gql a(ayw $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<gql> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends lk> {
      gcq<T> create(gdi var1);
   }
}
