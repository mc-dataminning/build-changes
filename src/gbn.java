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

public class gbn implements ato {
   private static final Logger b = LogUtils.getLogger();
   private static final akd c = akd.a("particles");
   private static final akk d = new akk("particles");
   private static final int e = 16384;
   private static final List<gbp> f = ImmutableList.of(gbp.a, gbp.b, gbp.d, gbp.c, gbp.e);
   protected fyd a;
   private final Map<gbp, Queue<gbl>> g = Maps.newIdentityHashMap();
   private final Queue<gcn> h = Queues.newArrayDeque();
   private final gpj i;
   private final aym j = aym.a();
   private final Int2ObjectMap<gbo<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<gbl> l = Queues.newArrayDeque();
   private final Map<akk, gbn.b> m = Maps.newHashMap();
   private final gph n;
   private final Object2IntOpenHashMap<lg> o = new Object2IntOpenHashMap();

   public gbn(fyd $$0, gpj $$1) {
      this.n = new gph(gph.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(lj.a, gbc.a::new);
      this.a(lj.c, new gae.a());
      this.a(lj.b, new gck.b());
      this.a(lj.d, gah.a::new);
      this.a(lj.aq, gag.a::new);
      this.a(lj.ao, gai.a::new);
      this.a(lj.at, gaj.a::new);
      this.a(lj.au, gaj.b::new);
      this.a(lj.e, gbq.a::new);
      this.a(lj.P, gcj.a::new);
      this.a(lj.f, gal.c::new);
      this.a(lj.ap, gcr.a::new);
      this.a(lj.g, gal.a::new);
      this.a(lj.h, gam.a::new);
      this.a(lj.as, gcj.b::new);
      this.a(lj.i, gan::c);
      this.a(lj.j, gan::d);
      this.a(lj.k, gan::e);
      this.a(lj.l, gan::a);
      this.a(lj.m, gan::b);
      this.a(lj.n, gap.a::new);
      this.a(lj.o, gao.a::new);
      this.a(lj.p, gcd.c::new);
      this.a(lj.q, new gbi.a());
      this.a(lj.r, gal.b::new);
      this.a(lj.s, gay.a::new);
      this.a(lj.t, gas.a::new);
      this.a(lj.u, gcd.b::new);
      this.a(lj.v, new gbe.a());
      this.a(lj.w, gbd.a::new);
      this.a(lj.B, gcb.a::new);
      this.a(lj.C, gau.a::new);
      this.a(lj.x, gba.a::new);
      this.a(lj.y, gba.b::new);
      this.a(lj.z, new gbb.a(3.0, 7, 0));
      this.a(lj.A, new gbb.a(1.0, 3, 2));
      this.a(lj.D, gav.d::new);
      this.a(lj.E, gcq.a::new);
      this.a(lj.F, gaw.a::new);
      this.a(lj.G, gcd.c::new);
      this.a(lj.I, gcc.a::new);
      this.a(lj.J, gbu.a::new);
      this.a(lj.K, gbv.a::new);
      this.a(lj.M, gcc.b::new);
      this.a(lj.L, gaw.a::new);
      this.a(lj.N, gav.a::new);
      this.a(lj.O, gcj.d::new);
      this.a(lj.Q, gbc.b::new);
      this.a(lj.R, gcd.a::new);
      this.a(lj.S, new gaf.b());
      this.a(lj.U, new gaf.c());
      this.a(lj.V, new gaf.a());
      this.a(lj.W, new gaf.d());
      this.a(lj.X, gbg.a::new);
      this.a(lj.Y, gbh.a::new);
      this.a(lj.Z, gcj.e::new);
      this.a(lj.ar, gay.b::new);
      this.a(lj.aa, gbk.a::new);
      this.a(lj.ab, gat.a::new);
      this.a(lj.ac, gbr.a::new);
      this.a(lj.ad, gcs.a::new);
      this.a(lj.ae, gbz.a::new);
      this.a(lj.af, gcu.a::new);
      this.a(lj.ag, gbq.b::new);
      this.a(lj.aK, gca.a::new);
      this.a(lj.ah, gce.a::new);
      this.a(lj.aj, gac.a::new);
      this.a(lj.ak, gcm.a::new);
      this.a(lj.ai, gch.b::new);
      this.a(lj.al, gci.c::new);
      this.a(lj.am, gcf.a::new);
      this.a(lj.an, gcd.d::new);
      this.a(lj.av, gan::f);
      this.a(lj.aw, gan::g);
      this.a(lj.ax, gan::h);
      this.a(lj.ay, gan::m);
      this.a(lj.az, gan::n);
      this.a(lj.aD, gci.b::new);
      this.a(lj.aA, gab.a::new);
      this.a(lj.aB, gci.a::new);
      this.a(lj.aC, gci.d::new);
      this.a(lj.aE, gan::o);
      this.a(lj.aF, gan::p);
      this.a(lj.aG, gan::q);
      this.a(lj.aH, gbs.a::new);
      this.a(lj.aI, gct.a::new);
      this.a(lj.aJ, gaw.b::new);
      this.a(lj.aN, gan::i);
      this.a(lj.aO, gan::j);
      this.a(lj.H, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new gak($$2, $$3, $$4, $$5, $$0));
      this.a(lj.aL, gan::k);
      this.a(lj.aM, gan::l);
      this.a(lj.T, gcp.a::new);
      this.a(lj.aP, gch.a::new);
      this.a(lj.aQ, gaz.b::new);
      this.a(lj.aR, gaz.e::new);
      this.a(lj.aS, gaz.d::new);
      this.a(lj.aT, gaz.a::new);
      this.a(lj.aU, gaz.c::new);
      this.a(lj.aV, gbw.a::new);
      this.a(lj.aW, gcj.c::new);
      this.a(lj.aX, gar.a::new);
      this.a(lj.aY, gco.a::new);
      this.a(lj.aZ, gco.a::new);
      this.a(lj.ba, gay.c::new);
      this.a(lj.bb, new gck.a());
      this.a(lj.bd, gcd.c::new);
      this.a(lj.be, gcd.c::new);
      this.a(lj.bc, gax.a::new);
   }

   private <T extends lh> void a(li<T> $$0, gbo<T> $$1) {
      this.k.put(lq.i.a($$0), $$1);
   }

   private <T extends lh> void a(li<T> $$0, gbo.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            gcl $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends lh> void a(li<T> $$0, gbn.c<T> $$1) {
      gbn.b $$2 = new gbn.b();
      this.m.put(lq.i.b($$0), $$2);
      this.k.put(lq.i.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(ato.a $$0, atu $$1, bmr $$2, bmr $$3, Executor $$4, Executor $$5) {
      record a(akk a, Optional<List<akk>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<akk, ats>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            akk $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ac.d($$2x);
      });
      CompletableFuture<gpd.a> $$7 = gpd.a(this.n).a($$1, d, 0, $$4).thenCompose(gpd.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         gpd.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<akk> $$5x = new HashSet<>();
         gpi $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<akk>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<gpi> $$5xx = new ArrayList<>();

               for (akk $$6xx : $$4xx.get()) {
                  gpi $$7x = $$4x.f().get($$6xx);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(akk::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<akk>> a(akk $$0, ats $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               gbm $$3 = gbm.a(axu.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bsd $$0, lh $$1) {
      this.h.add(new gcn(this.a, $$0, $$1));
   }

   public void a(bsd $$0, lh $$1, int $$2) {
      this.h.add(new gcn(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public gbl a(lh $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gbl $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends lh> gbl b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gbo<T> $$7 = (gbo<T>)this.k.get(lq.i.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(gbl $$0) {
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
         List<gcn> $$0 = Lists.newArrayList();

         for (gcn $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      gbl $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<gbl> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<gbl> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            gbl $$2 = $$1.next();
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

   private void b(gbl $$0) {
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

   public void a(gdw $$0, fey $$1, float $$2) {
      $$0.c();
      RenderSystem.enableDepthTest();

      for (gbp $$3 : f) {
         Iterable<gbl> $$4 = this.g.get($$3);
         if ($$4 != null) {
            RenderSystem.setShader(gdq::t);
            fai $$5 = fai.b();
            fab $$6 = $$5.d();
            $$3.a($$6, this.i);

            for (gbl $$7 : $$4) {
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

   public void a(@Nullable fyd $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(ja $$0, dsh $$1) {
      if (!$$1.i() && $$1.z()) {
         ews $$2 = $$1.j(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, aye.c($$8 / 0.25));
               int $$12 = Math.max(2, aye.c($$9 / 0.25));
               int $$13 = Math.max(2, aye.c($$10 / 0.25));

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
                           new gck(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(ja $$0, jf $$1) {
      dsh $$2 = this.a.a_($$0);
      if ($$2.l() != dll.a && $$2.z()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         evu $$7 = $$2.j(this.a, $$0).a();
         double $$8 = (double)$$3 + this.j.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.j.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.j.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == jf.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == jf.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == jf.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == jf.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == jf.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == jf.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new gck(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
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

   static class b implements gcg {
      private List<gpi> a;

      @Override
      public gpi a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public gpi a(aym $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<gpi> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends lh> {
      gbo<T> create(gcg var1);
   }
}
