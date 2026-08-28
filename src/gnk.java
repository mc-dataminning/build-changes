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

public class gnk implements auw {
   private static final Logger b = LogUtils.getLogger();
   private static final akz c = akz.a("particles");
   private static final int d = 16384;
   private static final List<gnm> e = List.of(gnm.a, gnm.b, gnm.c);
   protected gjz a;
   private final Map<gnm, Queue<gni>> f = Maps.newIdentityHashMap();
   private final Queue<gok> g = Queues.newArrayDeque();
   private final azv h = azv.a();
   private final Int2ObjectMap<gnl<?>> i = new Int2ObjectOpenHashMap();
   private final Queue<gni> j = Queues.newArrayDeque();
   private final Map<alg, gnk.b> k = Maps.newHashMap();
   private final hiw l;
   private final Object2IntOpenHashMap<lu> m = new Object2IntOpenHashMap();

   public gnk(gjz $$0, hiz $$1) {
      this.l = new hiw(hiw.e);
      $$1.a(this.l.g(), this.l);
      this.a = $$0;
      this.e();
   }

   private void e() {
      this.a(lx.a, gmz.a::new);
      this.a(lx.c, new gma.a());
      this.a(lx.b, new goh.c());
      this.a(lx.d, gmd.a::new);
      this.a(lx.at, gmc.a::new);
      this.a(lx.ar, gme.a::new);
      this.a(lx.aw, gmf.a::new);
      this.a(lx.ax, gmf.b::new);
      this.a(lx.e, gnn.a::new);
      this.a(lx.R, gog.a::new);
      this.a(lx.f, gmg.c::new);
      this.a(lx.as, gop.a::new);
      this.a(lx.g, gmg.a::new);
      this.a(lx.h, gmh.a::new);
      this.a(lx.av, gog.b::new);
      this.a(lx.i, gmi::c);
      this.a(lx.j, gmi::d);
      this.a(lx.k, gmi::e);
      this.a(lx.l, gmi::a);
      this.a(lx.m, gmi::b);
      this.a(lx.n, gmk.a::new);
      this.a(lx.o, gmj.a::new);
      this.a(lx.p, goa.c::new);
      this.a(lx.q, new gnf.a());
      this.a(lx.r, gmg.b::new);
      this.a(lx.s, gmv.a::new);
      this.a(lx.t, gmn.a::new);
      this.a(lx.u, goa.b::new);
      this.a(lx.v, new gnb.a());
      this.a(lx.w, gna.a::new);
      this.a(lx.B, gny.a::new);
      this.a(lx.C, gmp.a::new);
      this.a(lx.x, gmx.a::new);
      this.a(lx.y, gmx.b::new);
      this.a(lx.z, new gmy.a(3.0, 7, 0));
      this.a(lx.A, new gmy.a(1.0, 3, 2));
      this.a(lx.D, gms.d::new);
      this.a(lx.E, goo.a::new);
      this.a(lx.F, gmt.a::new);
      this.a(lx.G, goa.c::new);
      this.a(lx.K, gnz.a::new);
      this.a(lx.L, gnr.a::new);
      this.a(lx.M, gns.a::new);
      this.a(lx.O, gnz.b::new);
      this.a(lx.N, gmt.a::new);
      this.a(lx.P, gms.a::new);
      this.a(lx.Q, gog.d::new);
      this.a(lx.S, gmz.b::new);
      this.a(lx.T, goa.a::new);
      this.a(lx.U, new gmb.c());
      this.a(lx.X, new gmb.d());
      this.a(lx.Y, new gmb.a());
      this.a(lx.Z, new gmb.e());
      this.a(lx.aa, gnd.a::new);
      this.a(lx.ab, gne.a::new);
      this.a(lx.ac, gog.e::new);
      this.a(lx.au, gmv.b::new);
      this.a(lx.ad, gnh.a::new);
      this.a(lx.ae, gmo.a::new);
      this.a(lx.af, gno.a::new);
      this.a(lx.ag, goq.a::new);
      this.a(lx.ah, gnw.a::new);
      this.a(lx.ai, gos.a::new);
      this.a(lx.aj, gnn.b::new);
      this.a(lx.aN, gnx.a::new);
      this.a(lx.ak, gob.a::new);
      this.a(lx.am, gly.a::new);
      this.a(lx.an, goj.a::new);
      this.a(lx.al, goe.b::new);
      this.a(lx.ao, gof.c::new);
      this.a(lx.ap, goc.a::new);
      this.a(lx.aq, goa.d::new);
      this.a(lx.ay, gmi::f);
      this.a(lx.az, gmi::g);
      this.a(lx.aA, gmi::h);
      this.a(lx.aB, gmi::m);
      this.a(lx.aC, gmi::n);
      this.a(lx.aG, gof.b::new);
      this.a(lx.aD, glx.a::new);
      this.a(lx.aE, gof.a::new);
      this.a(lx.aF, gof.d::new);
      this.a(lx.aH, gmi::o);
      this.a(lx.aI, gmi::p);
      this.a(lx.aJ, gmi::q);
      this.a(lx.aK, gnp.a::new);
      this.a(lx.aL, gor.a::new);
      this.a(lx.aM, gmt.b::new);
      this.a(lx.aQ, gmi::i);
      this.a(lx.aR, gmi::j);
      this.a(lx.H, gmq.a::new);
      this.a(lx.I, gmq.b::new);
      this.a(lx.J, gmq.c::new);
      this.a(lx.aO, gmi::k);
      this.a(lx.aP, gmi::l);
      this.a(lx.V, gon.a::new);
      this.a(lx.W, gol.a::new);
      this.a(lx.aS, goe.a::new);
      this.a(lx.aT, gmw.b::new);
      this.a(lx.aU, gmw.e::new);
      this.a(lx.aV, gmw.d::new);
      this.a(lx.aW, gmw.a::new);
      this.a(lx.aX, gmw.c::new);
      this.a(lx.aY, gnt.a::new);
      this.a(lx.aZ, gog.c::new);
      this.a(lx.ba, gmm.a::new);
      this.a(lx.bb, gom.a::new);
      this.a(lx.bc, gom.a::new);
      this.a(lx.bd, gmv.c::new);
      this.a(lx.be, new goh.b());
      this.a(lx.bg, goa.c::new);
      this.a(lx.bh, goa.c::new);
      this.a(lx.bf, gmu.a::new);
      this.a(lx.bi, new goh.a());
      this.a(lx.bj, gmr.a::new);
   }

   private <T extends lv> void a(lw<T> $$0, gnl<T> $$1) {
      this.i.put(mf.i.a($$0), $$1);
   }

   private <T extends lv> void a(lw<T> $$0, gnl.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            goi $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends lv> void a(lw<T> $$0, gnk.c<T> $$1) {
      gnk.b $$2 = new gnk.b();
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
      CompletableFuture<his.a> $$5 = his.a(this.l).a($$1, hkv.k, 0, $$2).thenCompose(his.a::a);
      return CompletableFuture.allOf($$5, $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> {
         this.f();
         bqo $$3x = bqn.a();
         $$3x.a("upload");
         his.a $$4x = $$5.join();
         this.l.a($$4x);
         $$3x.b("bindSpriteSets");
         Set<alg> $$5x = new HashSet<>();
         hix $$6 = $$4x.e();
         $$4.join().forEach($$3xx -> {
            Optional<List<alg>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<hix> $$5xx = new ArrayList<>();

               for (alg $$6x : $$4xx.get()) {
                  hix $$7 = $$4x.f().get($$6x);
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
               gnj $$3 = gnj.a(azc.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bwf $$0, lv $$1) {
      this.g.add(new gok(this.a, $$0, $$1));
   }

   public void a(bwf $$0, lv $$1, int $$2) {
      this.g.add(new gok(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public gni a(lv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gni $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends lv> gni b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gnl<T> $$7 = (gnl<T>)this.i.get(mf.i.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(gni $$0) {
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
         bqn.a().a($$0.toString());
         this.a($$1x);
         bqn.a().c();
      });
      if (!this.g.isEmpty()) {
         List<gok> $$0 = Lists.newArrayList();

         for (gok $$1 : this.g) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.g.removeAll($$0);
      }

      gni $$2;
      if (!this.j.isEmpty()) {
         while (($$2 = this.j.poll()) != null) {
            this.f.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<gni> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<gni> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            gni $$2 = $$1.next();
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

   private void b(gni $$0) {
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

   public void a(fog $$0, float $$1, gqa.a $$2) {
      for (gnm $$3 : e) {
         Queue<gni> $$4 = this.f.get($$3);
         if ($$4 != null && !$$4.isEmpty()) {
            a($$0, $$1, $$2, $$3, $$4);
         }
      }

      Queue<gni> $$5 = this.f.get(gnm.d);
      if ($$5 != null && !$$5.isEmpty()) {
         a($$0, $$1, $$2, $$5);
      }

      $$2.b();
   }

   private static void a(fog $$0, float $$1, gqa.a $$2, gnm $$3, Queue<gni> $$4) {
      fjn $$5 = $$2.getBuffer(Objects.requireNonNull($$3.b()));

      for (gni $$6 : $$4) {
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

   private static void a(fog $$0, float $$1, gqa.a $$2, Queue<gni> $$3) {
      fjj $$4 = new fjj();

      for (gni $$5 : $$3) {
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

   public void a(@Nullable gjz $$0) {
      this.a = $$0;
      this.f();
      this.g.clear();
   }

   public void a(iu $$0, eah $$1) {
      if (!$$1.l() && $$1.D()) {
         ffk $$2 = $$1.f(this.a, $$0);
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
                           new goh(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(iu $$0, ja $$1) {
      eah $$2 = this.a.a_($$0);
      if ($$2.o() != dss.a && $$2.D()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         fel $$7 = $$2.f(this.a, $$0).a();
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

         this.a(new goh(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
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

   static class b implements god {
      private List<hix> a;

      @Override
      public hix a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public hix a(azv $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<hix> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends lv> {
      gnl<T> create(god var1);
   }
}
