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

public class gnw implements auw {
   private static final Logger b = LogUtils.getLogger();
   private static final akz c = akz.a("particles");
   private static final int d = 16384;
   private static final List<gny> e = List.of(gny.a, gny.b, gny.c);
   protected gkl a;
   private final Map<gny, Queue<gnu>> f = Maps.newIdentityHashMap();
   private final Queue<gow> g = Queues.newArrayDeque();
   private final azv h = azv.a();
   private final Int2ObjectMap<gnx<?>> i = new Int2ObjectOpenHashMap();
   private final Queue<gnu> j = Queues.newArrayDeque();
   private final Map<alg, gnw.b> k = Maps.newHashMap();
   private final hjj l;
   private final Object2IntOpenHashMap<lv> m = new Object2IntOpenHashMap();

   public gnw(gkl $$0, hjm $$1) {
      this.l = new hjj(hjj.d);
      $$1.a(this.l.h(), this.l);
      this.a = $$0;
      this.d();
   }

   private void d() {
      this.a(ly.a, gnl.a::new);
      this.a(ly.c, new gmm.a());
      this.a(ly.b, new got.c());
      this.a(ly.d, gmp.a::new);
      this.a(ly.at, gmo.a::new);
      this.a(ly.ar, gmq.a::new);
      this.a(ly.aw, gmr.a::new);
      this.a(ly.ax, gmr.b::new);
      this.a(ly.e, gnz.a::new);
      this.a(ly.R, gos.a::new);
      this.a(ly.f, gms.c::new);
      this.a(ly.as, gpb.a::new);
      this.a(ly.g, gms.a::new);
      this.a(ly.h, gmt.a::new);
      this.a(ly.av, gos.b::new);
      this.a(ly.i, gmu::c);
      this.a(ly.j, gmu::d);
      this.a(ly.k, gmu::e);
      this.a(ly.l, gmu::a);
      this.a(ly.m, gmu::b);
      this.a(ly.n, gmw.a::new);
      this.a(ly.o, gmv.a::new);
      this.a(ly.p, gom.c::new);
      this.a(ly.q, new gnr.a());
      this.a(ly.r, gms.b::new);
      this.a(ly.s, gnh.a::new);
      this.a(ly.t, gmz.a::new);
      this.a(ly.u, gom.b::new);
      this.a(ly.v, new gnn.a());
      this.a(ly.w, gnm.a::new);
      this.a(ly.B, gok.a::new);
      this.a(ly.C, gnb.a::new);
      this.a(ly.x, gnj.a::new);
      this.a(ly.y, gnj.b::new);
      this.a(ly.z, new gnk.a(3.0, 7, 0));
      this.a(ly.A, new gnk.a(1.0, 3, 2));
      this.a(ly.D, gne.d::new);
      this.a(ly.E, gpa.a::new);
      this.a(ly.F, gnf.a::new);
      this.a(ly.G, gom.c::new);
      this.a(ly.K, gol.a::new);
      this.a(ly.L, god.a::new);
      this.a(ly.M, goe.a::new);
      this.a(ly.O, gol.b::new);
      this.a(ly.N, gnf.a::new);
      this.a(ly.P, gne.a::new);
      this.a(ly.Q, gos.d::new);
      this.a(ly.S, gnl.b::new);
      this.a(ly.T, gom.a::new);
      this.a(ly.U, new gmn.c());
      this.a(ly.X, new gmn.d());
      this.a(ly.Y, new gmn.a());
      this.a(ly.Z, new gmn.e());
      this.a(ly.aa, gnp.a::new);
      this.a(ly.ab, gnq.a::new);
      this.a(ly.ac, gos.e::new);
      this.a(ly.au, gnh.b::new);
      this.a(ly.ad, gnt.a::new);
      this.a(ly.ae, gna.a::new);
      this.a(ly.af, goa.a::new);
      this.a(ly.ag, gpc.a::new);
      this.a(ly.ah, goi.a::new);
      this.a(ly.ai, gpe.a::new);
      this.a(ly.aj, gnz.b::new);
      this.a(ly.aN, goj.a::new);
      this.a(ly.ak, gon.a::new);
      this.a(ly.am, gmk.a::new);
      this.a(ly.an, gov.a::new);
      this.a(ly.al, goq.b::new);
      this.a(ly.ao, gor.c::new);
      this.a(ly.ap, goo.a::new);
      this.a(ly.aq, gom.d::new);
      this.a(ly.ay, gmu::f);
      this.a(ly.az, gmu::g);
      this.a(ly.aA, gmu::h);
      this.a(ly.aB, gmu::m);
      this.a(ly.aC, gmu::n);
      this.a(ly.aG, gor.b::new);
      this.a(ly.aD, gmj.a::new);
      this.a(ly.aE, gor.a::new);
      this.a(ly.aF, gor.d::new);
      this.a(ly.aH, gmu::o);
      this.a(ly.aI, gmu::p);
      this.a(ly.aJ, gmu::q);
      this.a(ly.aK, gob.a::new);
      this.a(ly.aL, gpd.a::new);
      this.a(ly.aM, gnf.b::new);
      this.a(ly.aQ, gmu::i);
      this.a(ly.aR, gmu::j);
      this.a(ly.H, gnc.a::new);
      this.a(ly.I, gnc.b::new);
      this.a(ly.J, gnc.c::new);
      this.a(ly.aO, gmu::k);
      this.a(ly.aP, gmu::l);
      this.a(ly.V, goz.a::new);
      this.a(ly.W, gox.a::new);
      this.a(ly.aS, goq.a::new);
      this.a(ly.aT, gni.b::new);
      this.a(ly.aU, gni.e::new);
      this.a(ly.aV, gni.d::new);
      this.a(ly.aW, gni.a::new);
      this.a(ly.aX, gni.c::new);
      this.a(ly.aY, gof.a::new);
      this.a(ly.aZ, gos.c::new);
      this.a(ly.ba, gmy.a::new);
      this.a(ly.bb, goy.a::new);
      this.a(ly.bc, goy.a::new);
      this.a(ly.bd, gnh.c::new);
      this.a(ly.be, new got.b());
      this.a(ly.bg, gom.c::new);
      this.a(ly.bh, gom.c::new);
      this.a(ly.bf, gng.a::new);
      this.a(ly.bi, new got.a());
      this.a(ly.bj, gnd.a::new);
   }

   private <T extends lw> void a(lx<T> $$0, gnx<T> $$1) {
      this.i.put(mg.i.a($$0), $$1);
   }

   private <T extends lw> void a(lx<T> $$0, gnx.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            gou $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends lw> void a(lx<T> $$0, gnw.c<T> $$1) {
      gnw.b $$2 = new gnw.b();
      this.k.put(mg.i.b($$0), $$2);
      this.i.put(mg.i.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> reload(auw.a $$0, avd $$1, Executor $$2, Executor $$3) {
      record a(alg a, Optional<List<alg>> b) {
      }

      CompletableFuture<List<a>> $$4 = CompletableFuture.<Map<alg, avb>>supplyAsync(() -> c.a($$1), $$2).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            alg $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$2));
         });
         return ag.d($$2x);
      });
      CompletableFuture<hjf.a> $$5 = hjf.a(this.l).a($$1, hli.k, 0, $$2).thenCompose(hjf.a::a);
      return CompletableFuture.allOf($$5, $$4).thenCompose($$0::wait).thenAcceptAsync($$2x -> {
         this.e();
         bqq $$3x = bqp.a();
         $$3x.a("upload");
         hjf.a $$4x = $$5.join();
         this.l.a($$4x);
         $$3x.b("bindSpriteSets");
         Set<alg> $$5x = new HashSet<>();
         hjk $$6 = $$4x.e();
         $$4.join().forEach($$3xx -> {
            Optional<List<alg>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<hjk> $$5xx = new ArrayList<>();

               for (alg $$6x : $$4xx.get()) {
                  hjk $$7 = $$4x.f().get($$6x);
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
      this.l.g();
   }

   private Optional<List<alg>> a(alg $$0, avb $$1) {
      if (!this.k.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               gnv $$3 = gnv.a(azc.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bwi $$0, lw $$1) {
      this.g.add(new gow(this.a, $$0, $$1));
   }

   public void a(bwi $$0, lw $$1, int $$2) {
      this.g.add(new gow(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public gnu a(lw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gnu $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends lw> gnu b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gnx<T> $$7 = (gnx<T>)this.i.get(mg.i.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(gnu $$0) {
      Optional<lv> $$1 = $$0.o();
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
         bqp.a().a($$0.toString());
         this.a($$1x);
         bqp.a().c();
      });
      if (!this.g.isEmpty()) {
         List<gow> $$0 = Lists.newArrayList();

         for (gow $$1 : this.g) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.g.removeAll($$0);
      }

      gnu $$2;
      if (!this.j.isEmpty()) {
         while (($$2 = this.j.poll()) != null) {
            this.f.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<gnu> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<gnu> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            gnu $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(lv $$0, int $$1) {
      this.m.addTo($$0, $$1);
   }

   private void b(gnu $$0) {
      try {
         $$0.a();
      } catch (Throwable var5) {
         p $$2 = p.a(var5, "Ticking Particle");
         q $$3 = $$2.a("Particle being ticked");
         $$3.a("Particle", $$0::toString);
         $$3.a("Particle Type", $$0.b()::toString);
         throw new aa($$2);
      }
   }

   public void a(fow $$0, float $$1, gqm.a $$2) {
      for (gny $$3 : e) {
         Queue<gnu> $$4 = this.f.get($$3);
         if ($$4 != null && !$$4.isEmpty()) {
            a($$0, $$1, $$2, $$3, $$4);
         }
      }

      Queue<gnu> $$5 = this.f.get(gny.d);
      if ($$5 != null && !$$5.isEmpty()) {
         a($$0, $$1, $$2, $$5);
      }

      $$2.b();
   }

   private static void a(fow $$0, float $$1, gqm.a $$2, gny $$3, Queue<gnu> $$4) {
      fkc $$5 = $$2.getBuffer(Objects.requireNonNull($$3.b()));

      for (gnu $$6 : $$4) {
         try {
            $$6.a($$5, $$0, $$1);
         } catch (Throwable var11) {
            p $$8 = p.a(var11, "Rendering Particle");
            q $$9 = $$8.a("Particle being rendered");
            $$9.a("Particle", $$6::toString);
            $$9.a("Particle Type", $$3::toString);
            throw new aa($$8);
         }
      }
   }

   private static void a(fow $$0, float $$1, gqm.a $$2, Queue<gnu> $$3) {
      fjy $$4 = new fjy();

      for (gnu $$5 : $$3) {
         try {
            $$5.a($$4, $$2, $$0, $$1);
         } catch (Throwable var10) {
            p $$7 = p.a(var10, "Rendering Particle");
            q $$8 = $$7.a("Particle being rendered");
            $$8.a("Particle", $$5::toString);
            $$8.a("Particle Type", "Custom");
            throw new aa($$7);
         }
      }
   }

   public void a(@Nullable gkl $$0) {
      this.a = $$0;
      this.e();
      this.g.clear();
   }

   public void a(iv $$0, eao $$1) {
      if (!$$1.l() && $$1.D()) {
         ffr $$2 = $$1.f(this.a, $$0);
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
                           new got(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(iv $$0, jb $$1) {
      eao $$2 = this.a.a_($$0);
      if ($$2.o() != dsz.a && $$2.D()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         fes $$7 = $$2.f(this.a, $$0).a();
         double $$8 = (double)$$3 + this.h.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.h.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.h.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == jb.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == jb.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == jb.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == jb.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == jb.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == jb.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new got(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String c() {
      return String.valueOf(this.f.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(lv $$0) {
      return this.m.getInt($$0) < $$0.a();
   }

   private void e() {
      this.f.clear();
      this.j.clear();
      this.g.clear();
      this.m.clear();
   }

   static class b implements gop {
      private List<hjk> a;

      @Override
      public hjk a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public hjk a(azv $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<hjk> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends lw> {
      gnx<T> create(gop var1);
   }
}
