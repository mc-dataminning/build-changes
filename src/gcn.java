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

public class gcn implements aty {
   private static final Logger b = LogUtils.getLogger();
   private static final akk c = akk.a("particles");
   private static final akr d = akr.b("particles");
   private static final int e = 16384;
   private static final List<gcp> f = ImmutableList.of(gcp.a, gcp.b, gcp.d, gcp.c, gcp.e);
   protected fzd a;
   private final Map<gcp, Queue<gcl>> g = Maps.newIdentityHashMap();
   private final Queue<gdn> h = Queues.newArrayDeque();
   private final gqk i;
   private final ayw j = ayw.a();
   private final Int2ObjectMap<gco<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<gcl> l = Queues.newArrayDeque();
   private final Map<akr, gcn.b> m = Maps.newHashMap();
   private final gqi n;
   private final Object2IntOpenHashMap<lj> o = new Object2IntOpenHashMap();

   public gcn(fzd $$0, gqk $$1) {
      this.n = new gqi(gqi.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(lm.a, gcc.a::new);
      this.a(lm.c, new gbe.a());
      this.a(lm.b, new gdk.b());
      this.a(lm.d, gbh.a::new);
      this.a(lm.aq, gbg.a::new);
      this.a(lm.ao, gbi.a::new);
      this.a(lm.at, gbj.a::new);
      this.a(lm.au, gbj.b::new);
      this.a(lm.e, gcq.a::new);
      this.a(lm.P, gdj.a::new);
      this.a(lm.f, gbl.c::new);
      this.a(lm.ap, gdr.a::new);
      this.a(lm.g, gbl.a::new);
      this.a(lm.h, gbm.a::new);
      this.a(lm.as, gdj.b::new);
      this.a(lm.i, gbn::c);
      this.a(lm.j, gbn::d);
      this.a(lm.k, gbn::e);
      this.a(lm.l, gbn::a);
      this.a(lm.m, gbn::b);
      this.a(lm.n, gbp.a::new);
      this.a(lm.o, gbo.a::new);
      this.a(lm.p, gdd.c::new);
      this.a(lm.q, new gci.a());
      this.a(lm.r, gbl.b::new);
      this.a(lm.s, gby.a::new);
      this.a(lm.t, gbs.a::new);
      this.a(lm.u, gdd.b::new);
      this.a(lm.v, new gce.a());
      this.a(lm.w, gcd.a::new);
      this.a(lm.B, gdb.a::new);
      this.a(lm.C, gbu.a::new);
      this.a(lm.x, gca.a::new);
      this.a(lm.y, gca.b::new);
      this.a(lm.z, new gcb.a(3.0, 7, 0));
      this.a(lm.A, new gcb.a(1.0, 3, 2));
      this.a(lm.D, gbv.d::new);
      this.a(lm.E, gdq.a::new);
      this.a(lm.F, gbw.a::new);
      this.a(lm.G, gdd.c::new);
      this.a(lm.I, gdc.a::new);
      this.a(lm.J, gcu.a::new);
      this.a(lm.K, gcv.a::new);
      this.a(lm.M, gdc.b::new);
      this.a(lm.L, gbw.a::new);
      this.a(lm.N, gbv.a::new);
      this.a(lm.O, gdj.d::new);
      this.a(lm.Q, gcc.b::new);
      this.a(lm.R, gdd.a::new);
      this.a(lm.S, new gbf.b());
      this.a(lm.U, new gbf.c());
      this.a(lm.V, new gbf.a());
      this.a(lm.W, new gbf.d());
      this.a(lm.X, gcg.a::new);
      this.a(lm.Y, gch.a::new);
      this.a(lm.Z, gdj.e::new);
      this.a(lm.ar, gby.b::new);
      this.a(lm.aa, gck.a::new);
      this.a(lm.ab, gbt.a::new);
      this.a(lm.ac, gcr.a::new);
      this.a(lm.ad, gds.a::new);
      this.a(lm.ae, gcz.a::new);
      this.a(lm.af, gdu.a::new);
      this.a(lm.ag, gcq.b::new);
      this.a(lm.aK, gda.a::new);
      this.a(lm.ah, gde.a::new);
      this.a(lm.aj, gbc.a::new);
      this.a(lm.ak, gdm.a::new);
      this.a(lm.ai, gdh.b::new);
      this.a(lm.al, gdi.c::new);
      this.a(lm.am, gdf.a::new);
      this.a(lm.an, gdd.d::new);
      this.a(lm.av, gbn::f);
      this.a(lm.aw, gbn::g);
      this.a(lm.ax, gbn::h);
      this.a(lm.ay, gbn::m);
      this.a(lm.az, gbn::n);
      this.a(lm.aD, gdi.b::new);
      this.a(lm.aA, gbb.a::new);
      this.a(lm.aB, gdi.a::new);
      this.a(lm.aC, gdi.d::new);
      this.a(lm.aE, gbn::o);
      this.a(lm.aF, gbn::p);
      this.a(lm.aG, gbn::q);
      this.a(lm.aH, gcs.a::new);
      this.a(lm.aI, gdt.a::new);
      this.a(lm.aJ, gbw.b::new);
      this.a(lm.aN, gbn::i);
      this.a(lm.aO, gbn::j);
      this.a(lm.H, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new gbk($$2, $$3, $$4, $$5, $$0));
      this.a(lm.aL, gbn::k);
      this.a(lm.aM, gbn::l);
      this.a(lm.T, gdp.a::new);
      this.a(lm.aP, gdh.a::new);
      this.a(lm.aQ, gbz.b::new);
      this.a(lm.aR, gbz.e::new);
      this.a(lm.aS, gbz.d::new);
      this.a(lm.aT, gbz.a::new);
      this.a(lm.aU, gbz.c::new);
      this.a(lm.aV, gcw.a::new);
      this.a(lm.aW, gdj.c::new);
      this.a(lm.aX, gbr.a::new);
      this.a(lm.aY, gdo.a::new);
      this.a(lm.aZ, gdo.a::new);
      this.a(lm.ba, gby.c::new);
      this.a(lm.bb, new gdk.a());
      this.a(lm.bd, gdd.c::new);
      this.a(lm.be, gdd.c::new);
      this.a(lm.bc, gbx.a::new);
   }

   private <T extends lk> void a(ll<T> $$0, gco<T> $$1) {
      this.k.put(lt.i.a($$0), $$1);
   }

   private <T extends lk> void a(ll<T> $$0, gco.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            gdl $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends lk> void a(ll<T> $$0, gcn.c<T> $$1) {
      gcn.b $$2 = new gcn.b();
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
      CompletableFuture<gqe.a> $$7 = gqe.a(this.n).a($$1, d, 0, $$4).thenCompose(gqe.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         gqe.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<akr> $$5x = new HashSet<>();
         gqj $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<akr>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<gqj> $$5xx = new ArrayList<>();

               for (akr $$6xx : $$4xx.get()) {
                  gqj $$7x = $$4x.f().get($$6xx);
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
               gcm $$3 = gcm.a(aye.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bsr $$0, lk $$1) {
      this.h.add(new gdn(this.a, $$0, $$1));
   }

   public void a(bsr $$0, lk $$1, int $$2) {
      this.h.add(new gdn(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public gcl a(lk $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gcl $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends lk> gcl b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gco<T> $$7 = (gco<T>)this.k.get(lt.i.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(gcl $$0) {
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
         List<gdn> $$0 = Lists.newArrayList();

         for (gdn $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      gcl $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<gcl> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<gcl> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            gcl $$2 = $$1.next();
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

   private void b(gcl $$0) {
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

   public void a(gew $$0, ffw $$1, float $$2) {
      $$0.c();
      RenderSystem.enableDepthTest();

      for (gcp $$3 : f) {
         Queue<gcl> $$4 = this.g.get($$3);
         if ($$4 != null && !$$4.isEmpty()) {
            RenderSystem.setShader(geq::s);
            fbi $$5 = fbi.b();
            fbb $$6 = $$3.a($$5, this.i);
            if ($$6 != null) {
               for (gcl $$7 : $$4) {
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

               fbf $$11 = $$6.a();
               if ($$11 != null) {
                  fbc.a($$11);
               }
            }
         }
      }

      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      $$0.b();
   }

   public void a(@Nullable fzd $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(jd $$0, dtc $$1) {
      if (!$$1.i() && $$1.z()) {
         ext $$2 = $$1.j(this.a, $$0);
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
                           new gdk(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
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
         ewv $$7 = $$2.j(this.a, $$0).a();
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

         this.a(new gdk(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
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

   static class b implements gdg {
      private List<gqj> a;

      @Override
      public gqj a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public gqj a(ayw $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<gqj> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends lk> {
      gco<T> create(gdg var1);
   }
}
