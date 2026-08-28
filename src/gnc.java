import com.google.common.collect.EvictingQueue;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
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
import java.util.Objects;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gnc implements auw {
   private static final Logger b = LogUtils.getLogger();
   private static final akz c = akz.a("particles");
   private static final int d = 16384;
   private static final List<gne> e = List.of(gne.a, gne.b, gne.c);
   protected gjr a;
   private final Map<gne, Queue<gna>> f = Maps.newIdentityHashMap();
   private final Queue<goc> g = Queues.newArrayDeque();
   private final azv h = azv.a();
   private final Int2ObjectMap<gnd<?>> i = new Int2ObjectOpenHashMap();
   private final Queue<gna> j = Queues.newArrayDeque();
   private final Map<alg, gnc.b> k = Maps.newHashMap();
   private final hio l;
   private final Object2IntOpenHashMap<lu> m = new Object2IntOpenHashMap();

   public gnc(gjr $$0, hir $$1) {
      this.l = new hio(hio.e);
      $$1.a(this.l.g(), this.l);
      this.a = $$0;
      this.e();
   }

   private void e() {
      this.a(lx.a, gmr.a::new);
      this.a(lx.c, new gls.a());
      this.a(lx.b, new gnz.c());
      this.a(lx.d, glv.a::new);
      this.a(lx.at, glu.a::new);
      this.a(lx.ar, glw.a::new);
      this.a(lx.aw, glx.a::new);
      this.a(lx.ax, glx.b::new);
      this.a(lx.e, gnf.a::new);
      this.a(lx.R, gny.a::new);
      this.a(lx.f, gly.c::new);
      this.a(lx.as, goh.a::new);
      this.a(lx.g, gly.a::new);
      this.a(lx.h, glz.a::new);
      this.a(lx.av, gny.b::new);
      this.a(lx.i, gma::c);
      this.a(lx.j, gma::d);
      this.a(lx.k, gma::e);
      this.a(lx.l, gma::a);
      this.a(lx.m, gma::b);
      this.a(lx.n, gmc.a::new);
      this.a(lx.o, gmb.a::new);
      this.a(lx.p, gns.c::new);
      this.a(lx.q, new gmx.a());
      this.a(lx.r, gly.b::new);
      this.a(lx.s, gmn.a::new);
      this.a(lx.t, gmf.a::new);
      this.a(lx.u, gns.b::new);
      this.a(lx.v, new gmt.a());
      this.a(lx.w, gms.a::new);
      this.a(lx.B, gnq.a::new);
      this.a(lx.C, gmh.a::new);
      this.a(lx.x, gmp.a::new);
      this.a(lx.y, gmp.b::new);
      this.a(lx.z, new gmq.a(3.0, 7, 0));
      this.a(lx.A, new gmq.a(1.0, 3, 2));
      this.a(lx.D, gmk.d::new);
      this.a(lx.E, gog.a::new);
      this.a(lx.F, gml.a::new);
      this.a(lx.G, gns.c::new);
      this.a(lx.K, gnr.a::new);
      this.a(lx.L, gnj.a::new);
      this.a(lx.M, gnk.a::new);
      this.a(lx.O, gnr.b::new);
      this.a(lx.N, gml.a::new);
      this.a(lx.P, gmk.a::new);
      this.a(lx.Q, gny.d::new);
      this.a(lx.S, gmr.b::new);
      this.a(lx.T, gns.a::new);
      this.a(lx.U, new glt.c());
      this.a(lx.X, new glt.d());
      this.a(lx.Y, new glt.a());
      this.a(lx.Z, new glt.e());
      this.a(lx.aa, gmv.a::new);
      this.a(lx.ab, gmw.a::new);
      this.a(lx.ac, gny.e::new);
      this.a(lx.au, gmn.b::new);
      this.a(lx.ad, gmz.a::new);
      this.a(lx.ae, gmg.a::new);
      this.a(lx.af, gng.a::new);
      this.a(lx.ag, goi.a::new);
      this.a(lx.ah, gno.a::new);
      this.a(lx.ai, gok.a::new);
      this.a(lx.aj, gnf.b::new);
      this.a(lx.aN, gnp.a::new);
      this.a(lx.ak, gnt.a::new);
      this.a(lx.am, glq.a::new);
      this.a(lx.an, gob.a::new);
      this.a(lx.al, gnw.b::new);
      this.a(lx.ao, gnx.c::new);
      this.a(lx.ap, gnu.a::new);
      this.a(lx.aq, gns.d::new);
      this.a(lx.ay, gma::f);
      this.a(lx.az, gma::g);
      this.a(lx.aA, gma::h);
      this.a(lx.aB, gma::m);
      this.a(lx.aC, gma::n);
      this.a(lx.aG, gnx.b::new);
      this.a(lx.aD, glp.a::new);
      this.a(lx.aE, gnx.a::new);
      this.a(lx.aF, gnx.d::new);
      this.a(lx.aH, gma::o);
      this.a(lx.aI, gma::p);
      this.a(lx.aJ, gma::q);
      this.a(lx.aK, gnh.a::new);
      this.a(lx.aL, goj.a::new);
      this.a(lx.aM, gml.b::new);
      this.a(lx.aQ, gma::i);
      this.a(lx.aR, gma::j);
      this.a(lx.H, gmi.a::new);
      this.a(lx.I, gmi.b::new);
      this.a(lx.J, gmi.c::new);
      this.a(lx.aO, gma::k);
      this.a(lx.aP, gma::l);
      this.a(lx.V, gof.a::new);
      this.a(lx.W, god.a::new);
      this.a(lx.aS, gnw.a::new);
      this.a(lx.aT, gmo.b::new);
      this.a(lx.aU, gmo.e::new);
      this.a(lx.aV, gmo.d::new);
      this.a(lx.aW, gmo.a::new);
      this.a(lx.aX, gmo.c::new);
      this.a(lx.aY, gnl.a::new);
      this.a(lx.aZ, gny.c::new);
      this.a(lx.ba, gme.a::new);
      this.a(lx.bb, goe.a::new);
      this.a(lx.bc, goe.a::new);
      this.a(lx.bd, gmn.c::new);
      this.a(lx.be, new gnz.b());
      this.a(lx.bg, gns.c::new);
      this.a(lx.bh, gns.c::new);
      this.a(lx.bf, gmm.a::new);
      this.a(lx.bi, new gnz.a());
      this.a(lx.bj, gmj.a::new);
   }

   private <T extends lv> void a(lw<T> $$0, gnd<T> $$1) {
      this.i.put(mf.i.a($$0), $$1);
   }

   private <T extends lv> void a(lw<T> $$0, gnd.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            goa $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends lv> void a(lw<T> $$0, gnc.c<T> $$1) {
      gnc.b $$2 = new gnc.b();
      this.k.put(mf.i.b($$0), $$2);
      this.i.put(mf.i.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(auw.a $$0, avd $$1, Executor $$2, Executor $$3) {
      record a(alg a, Optional<List<alg>> b) {
      }

      CompletableFuture<List<a>> $$4 = CompletableFuture.<Map<alg, avb>>supplyAsync(() -> c.a($$1), $$2).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            alg $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$2));
         });
         return af.d($$2x);
      });
      CompletableFuture<hik.a> $$5 = hik.a(this.l).a($$1, hkn.k, 0, $$2).thenCompose(hik.a::a);
      return CompletableFuture.allOf($$5, $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> {
         this.f();
         bqm $$3x = bql.a();
         $$3x.a("upload");
         hik.a $$4x = $$5.join();
         this.l.a($$4x);
         $$3x.b("bindSpriteSets");
         Set<alg> $$5x = new HashSet<>();
         hip $$6 = $$4x.e();
         $$4.join().forEach($$3xx -> {
            Optional<List<alg>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<hip> $$5xx = new ArrayList<>();

               for (alg $$6x : $$4xx.get()) {
                  hip $$7 = $$4x.f().get($$6x);
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

               this.k.get($$3xx.a()).a($$5xx);
            }
         });
         if (!$$5x.isEmpty()) {
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(alg::toString).collect(Collectors.joining(",")));
         }

         $$3x.c();
      }, $$3);
   }

   public void a() {
      this.l.f();
   }

   private Optional<List<alg>> a(alg $$0, avb $$1) {
      if (!this.k.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               gnb $$3 = gnb.a(azc.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bwd $$0, lv $$1) {
      this.g.add(new goc(this.a, $$0, $$1));
   }

   public void a(bwd $$0, lv $$1, int $$2) {
      this.g.add(new goc(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public gna a(lv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gna $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends lv> gna b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gnd<T> $$7 = (gnd<T>)this.i.get(mf.i.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(gna $$0) {
      Optional<lu> $$1 = $$0.o();
      if ($$1.isPresent()) {
         if (this.a($$1.get())) {
            this.j.add($$0);
            this.a($$1.get(), 1);
         }
      } else {
         this.j.add($$0);
      }
   }

   public void b() {
      this.f.forEach(($$0, $$1x) -> {
         bql.a().a($$0.toString());
         this.a($$1x);
         bql.a().c();
      });
      if (!this.g.isEmpty()) {
         List<goc> $$0 = Lists.newArrayList();

         for (goc $$1 : this.g) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.g.removeAll($$0);
      }

      gna $$2;
      if (!this.j.isEmpty()) {
         while (($$2 = this.j.poll()) != null) {
            this.f.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<gna> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<gna> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            gna $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(lu $$0, int $$1) {
      this.m.addTo($$0, $$1);
   }

   private void b(gna $$0) {
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

   public void a(fnz $$0, float $$1, gps.a $$2) {
      for (gne $$3 : e) {
         Queue<gna> $$4 = this.f.get($$3);
         if ($$4 != null && !$$4.isEmpty()) {
            a($$0, $$1, $$2, $$3, $$4);
         }
      }

      Queue<gna> $$5 = this.f.get(gne.d);
      if ($$5 != null && !$$5.isEmpty()) {
         a($$0, $$1, $$2, $$5);
      }

      $$2.b();
   }

   private static void a(fnz $$0, float $$1, gps.a $$2, gne $$3, Queue<gna> $$4) {
      fjg $$5 = $$2.getBuffer(Objects.requireNonNull($$3.b()));

      for (gna $$6 : $$4) {
         try {
            $$6.a($$5, $$0, $$1);
         } catch (Throwable var11) {
            o $$8 = o.a(var11, "Rendering Particle");
            p $$9 = $$8.a("Particle being rendered");
            $$9.a("Particle", $$6::toString);
            $$9.a("Particle Type", $$3::toString);
            throw new z($$8);
         }
      }
   }

   private static void a(fnz $$0, float $$1, gps.a $$2, Queue<gna> $$3) {
      fjc $$4 = new fjc();

      for (gna $$5 : $$3) {
         try {
            $$5.a($$4, $$2, $$0, $$1);
         } catch (Throwable var10) {
            o $$7 = o.a(var10, "Rendering Particle");
            p $$8 = $$7.a("Particle being rendered");
            $$8.a("Particle", $$5::toString);
            $$8.a("Particle Type", "Custom");
            throw new z($$7);
         }
      }
   }

   public void a(@Nullable gjr $$0) {
      this.a = $$0;
      this.f();
      this.g.clear();
   }

   public void a(iu $$0, dzz $$1) {
      if (!$$1.l() && $$1.D()) {
         ffc $$2 = $$1.f(this.a, $$0);
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
                           new gnz(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(iu $$0, ja $$1) {
      dzz $$2 = this.a.a_($$0);
      if ($$2.o() != dsm.a && $$2.D()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         fed $$7 = $$2.f(this.a, $$0).a();
         double $$8 = (double)$$3 + this.h.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.h.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.h.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == ja.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == ja.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == ja.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == ja.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == ja.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == ja.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new gnz(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.f.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(lu $$0) {
      return this.m.getInt($$0) < $$0.a();
   }

   private void f() {
      this.f.clear();
      this.j.clear();
      this.g.clear();
      this.m.clear();
   }

   static class b implements gnv {
      private List<hip> a;

      @Override
      public hip a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public hip a(azv $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<hip> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends lv> {
      gnd<T> create(gnv var1);
   }
}
