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

public class gob implements auw {
   private static final Logger b = LogUtils.getLogger();
   private static final akz c = akz.a("particles");
   private static final int d = 16384;
   private static final List<god> e = List.of(god.a, god.b, god.c);
   protected gkq a;
   private final Map<god, Queue<gnz>> f = Maps.newIdentityHashMap();
   private final Queue<gpb> g = Queues.newArrayDeque();
   private final azv h = azv.a();
   private final Int2ObjectMap<goc<?>> i = new Int2ObjectOpenHashMap();
   private final Queue<gnz> j = Queues.newArrayDeque();
   private final Map<alg, gob.b> k = Maps.newHashMap();
   private final hjp l;
   private final Object2IntOpenHashMap<lv> m = new Object2IntOpenHashMap();

   public gob(gkq $$0, hjs $$1) {
      this.l = new hjp(hjp.d);
      $$1.a(this.l.f(), this.l);
      this.a = $$0;
      this.d();
   }

   private void d() {
      this.a(ly.a, gnq.a::new);
      this.a(ly.c, new gmr.a());
      this.a(ly.b, new goy.c());
      this.a(ly.d, gmu.a::new);
      this.a(ly.at, gmt.a::new);
      this.a(ly.ar, gmv.a::new);
      this.a(ly.aw, gmw.a::new);
      this.a(ly.ax, gmw.b::new);
      this.a(ly.e, goe.a::new);
      this.a(ly.R, gox.a::new);
      this.a(ly.f, gmx.c::new);
      this.a(ly.as, gpg.a::new);
      this.a(ly.g, gmx.a::new);
      this.a(ly.h, gmy.a::new);
      this.a(ly.av, gox.b::new);
      this.a(ly.i, gmz::c);
      this.a(ly.j, gmz::d);
      this.a(ly.k, gmz::e);
      this.a(ly.l, gmz::a);
      this.a(ly.m, gmz::b);
      this.a(ly.n, gnb.a::new);
      this.a(ly.o, gna.a::new);
      this.a(ly.p, gor.c::new);
      this.a(ly.q, new gnw.a());
      this.a(ly.r, gmx.b::new);
      this.a(ly.s, gnm.a::new);
      this.a(ly.t, gne.a::new);
      this.a(ly.u, gor.b::new);
      this.a(ly.v, new gns.a());
      this.a(ly.w, gnr.a::new);
      this.a(ly.B, gop.a::new);
      this.a(ly.C, gng.a::new);
      this.a(ly.x, gno.a::new);
      this.a(ly.y, gno.b::new);
      this.a(ly.z, new gnp.a(3.0, 7, 0));
      this.a(ly.A, new gnp.a(1.0, 3, 2));
      this.a(ly.D, gnj.d::new);
      this.a(ly.E, gpf.a::new);
      this.a(ly.F, gnk.a::new);
      this.a(ly.G, gor.c::new);
      this.a(ly.K, goq.a::new);
      this.a(ly.L, goi.a::new);
      this.a(ly.M, goj.a::new);
      this.a(ly.O, goq.b::new);
      this.a(ly.N, gnk.a::new);
      this.a(ly.P, gnj.a::new);
      this.a(ly.Q, gox.d::new);
      this.a(ly.S, gnq.b::new);
      this.a(ly.T, gor.a::new);
      this.a(ly.U, new gms.c());
      this.a(ly.X, new gms.d());
      this.a(ly.Y, new gms.a());
      this.a(ly.Z, new gms.e());
      this.a(ly.aa, gnu.a::new);
      this.a(ly.ab, gnv.a::new);
      this.a(ly.ac, gox.e::new);
      this.a(ly.au, gnm.b::new);
      this.a(ly.ad, gny.a::new);
      this.a(ly.ae, gnf.a::new);
      this.a(ly.af, gof.a::new);
      this.a(ly.ag, gph.a::new);
      this.a(ly.ah, gon.a::new);
      this.a(ly.ai, gpj.a::new);
      this.a(ly.aj, goe.b::new);
      this.a(ly.aN, goo.a::new);
      this.a(ly.ak, gos.a::new);
      this.a(ly.am, gmp.a::new);
      this.a(ly.an, gpa.a::new);
      this.a(ly.al, gov.b::new);
      this.a(ly.ao, gow.c::new);
      this.a(ly.ap, got.a::new);
      this.a(ly.aq, gor.d::new);
      this.a(ly.ay, gmz::f);
      this.a(ly.az, gmz::g);
      this.a(ly.aA, gmz::h);
      this.a(ly.aB, gmz::m);
      this.a(ly.aC, gmz::n);
      this.a(ly.aG, gow.b::new);
      this.a(ly.aD, gmo.a::new);
      this.a(ly.aE, gow.a::new);
      this.a(ly.aF, gow.d::new);
      this.a(ly.aH, gmz::o);
      this.a(ly.aI, gmz::p);
      this.a(ly.aJ, gmz::q);
      this.a(ly.aK, gog.a::new);
      this.a(ly.aL, gpi.a::new);
      this.a(ly.aM, gnk.b::new);
      this.a(ly.aQ, gmz::i);
      this.a(ly.aR, gmz::j);
      this.a(ly.H, gnh.a::new);
      this.a(ly.I, gnh.b::new);
      this.a(ly.J, gnh.c::new);
      this.a(ly.aO, gmz::k);
      this.a(ly.aP, gmz::l);
      this.a(ly.V, gpe.a::new);
      this.a(ly.W, gpc.a::new);
      this.a(ly.aS, gov.a::new);
      this.a(ly.aT, gnn.b::new);
      this.a(ly.aU, gnn.e::new);
      this.a(ly.aV, gnn.d::new);
      this.a(ly.aW, gnn.a::new);
      this.a(ly.aX, gnn.c::new);
      this.a(ly.aY, gok.a::new);
      this.a(ly.aZ, gox.c::new);
      this.a(ly.ba, gnd.a::new);
      this.a(ly.bb, gpd.a::new);
      this.a(ly.bc, gpd.a::new);
      this.a(ly.bd, gnm.c::new);
      this.a(ly.be, new goy.b());
      this.a(ly.bg, gor.c::new);
      this.a(ly.bh, gor.c::new);
      this.a(ly.bf, gnl.a::new);
      this.a(ly.bi, new goy.a());
      this.a(ly.bj, gni.a::new);
   }

   private <T extends lw> void a(lx<T> $$0, goc<T> $$1) {
      this.i.put(mg.i.a($$0), $$1);
   }

   private <T extends lw> void a(lx<T> $$0, goc.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            goz $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends lw> void a(lx<T> $$0, gob.c<T> $$1) {
      gob.b $$2 = new gob.b();
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
      CompletableFuture<hjl.a> $$5 = hjl.a(this.l).a($$1, hlp.k, 0, $$2).thenCompose(hjl.a::a);
      return CompletableFuture.allOf($$5, $$4).thenCompose($$0::wait).thenAcceptAsync($$2x -> {
         this.e();
         bqq $$3x = bqp.a();
         $$3x.a("upload");
         hjl.a $$4x = $$5.join();
         this.l.a($$4x);
         $$3x.b("bindSpriteSets");
         Set<alg> $$5x = new HashSet<>();
         hjq $$6 = $$4x.e();
         $$4.join().forEach($$3xx -> {
            Optional<List<alg>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<hjq> $$5xx = new ArrayList<>();

               for (alg $$6x : $$4xx.get()) {
                  hjq $$7 = $$4x.f().get($$6x);
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
      this.l.e();
   }

   private Optional<List<alg>> a(alg $$0, avb $$1) {
      if (!this.k.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               goa $$3 = goa.a(azc.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bwi $$0, lw $$1) {
      this.g.add(new gpb(this.a, $$0, $$1));
   }

   public void a(bwi $$0, lw $$1, int $$2) {
      this.g.add(new gpb(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public gnz a(lw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gnz $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends lw> gnz b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      goc<T> $$7 = (goc<T>)this.i.get(mg.i.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(gnz $$0) {
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
         List<gpb> $$0 = Lists.newArrayList();

         for (gpb $$1 : this.g) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.g.removeAll($$0);
      }

      gnz $$2;
      if (!this.j.isEmpty()) {
         while (($$2 = this.j.poll()) != null) {
            this.f.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<gnz> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<gnz> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            gnz $$2 = $$1.next();
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

   private void b(gnz $$0) {
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

   public void a(fpb $$0, float $$1, gqr.a $$2) {
      for (god $$3 : e) {
         Queue<gnz> $$4 = this.f.get($$3);
         if ($$4 != null && !$$4.isEmpty()) {
            a($$0, $$1, $$2, $$3, $$4);
         }
      }

      Queue<gnz> $$5 = this.f.get(god.d);
      if ($$5 != null && !$$5.isEmpty()) {
         a($$0, $$1, $$2, $$5);
      }

      $$2.b();
   }

   private static void a(fpb $$0, float $$1, gqr.a $$2, god $$3, Queue<gnz> $$4) {
      fkh $$5 = $$2.getBuffer(Objects.requireNonNull($$3.b()));

      for (gnz $$6 : $$4) {
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

   private static void a(fpb $$0, float $$1, gqr.a $$2, Queue<gnz> $$3) {
      fkd $$4 = new fkd();

      for (gnz $$5 : $$3) {
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

   public void a(@Nullable gkq $$0) {
      this.a = $$0;
      this.e();
      this.g.clear();
   }

   public void a(iv $$0, eat $$1) {
      if (!$$1.l() && $$1.D()) {
         ffw $$2 = $$1.f(this.a, $$0);
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
                           new goy(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(iv $$0, jb $$1) {
      eat $$2 = this.a.a_($$0);
      if ($$2.o() != dte.a && $$2.D()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         fex $$7 = $$2.f(this.a, $$0).a();
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

         this.a(new goy(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
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

   static class b implements gou {
      private List<hjq> a;

      @Override
      public hjq a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public hjq a(azv $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<hjq> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends lw> {
      goc<T> create(gou var1);
   }
}
