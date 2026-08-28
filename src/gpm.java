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

public class gpm implements auz {
   private static final Logger b = LogUtils.getLogger();
   private static final alb c = alb.a("particles");
   private static final int d = 16384;
   private static final List<gpo> e = List.of(gpo.a, gpo.b, gpo.c);
   protected gmb a;
   private final Map<gpo, Queue<gpk>> f = Maps.newIdentityHashMap();
   private final Queue<gqm> g = Queues.newArrayDeque();
   private final azx h = azx.a();
   private final Int2ObjectMap<gpn<?>> i = new Int2ObjectOpenHashMap();
   private final Queue<gpk> j = Queues.newArrayDeque();
   private final Map<ali, gpm.b> k = Maps.newHashMap();
   private final hkz l;
   private final Object2IntOpenHashMap<lv> m = new Object2IntOpenHashMap();

   public gpm(gmb $$0, hlc $$1) {
      this.l = new hkz(hkz.d);
      $$1.a(this.l.e(), this.l);
      this.a = $$0;
      this.d();
   }

   private void d() {
      this.a(ly.a, gpb.a::new);
      this.a(ly.c, new goc.a());
      this.a(ly.b, new gqj.c());
      this.a(ly.d, gof.a::new);
      this.a(ly.at, goe.a::new);
      this.a(ly.ar, gog.a::new);
      this.a(ly.aw, goh.a::new);
      this.a(ly.ax, goh.b::new);
      this.a(ly.e, gpp.a::new);
      this.a(ly.R, gqi.a::new);
      this.a(ly.f, goi.c::new);
      this.a(ly.as, gqr.a::new);
      this.a(ly.g, goi.a::new);
      this.a(ly.h, goj.a::new);
      this.a(ly.av, gqi.b::new);
      this.a(ly.i, gok::c);
      this.a(ly.j, gok::d);
      this.a(ly.k, gok::e);
      this.a(ly.l, gok::a);
      this.a(ly.m, gok::b);
      this.a(ly.n, gom.a::new);
      this.a(ly.o, gol.a::new);
      this.a(ly.p, gqc.c::new);
      this.a(ly.q, new gph.a());
      this.a(ly.r, goi.b::new);
      this.a(ly.s, gox.a::new);
      this.a(ly.t, gop.a::new);
      this.a(ly.u, gqc.b::new);
      this.a(ly.v, new gpd.a());
      this.a(ly.w, gpc.a::new);
      this.a(ly.B, gqa.a::new);
      this.a(ly.C, gor.a::new);
      this.a(ly.x, goz.a::new);
      this.a(ly.y, goz.b::new);
      this.a(ly.z, new gpa.a(3.0, 7, 0));
      this.a(ly.A, new gpa.a(1.0, 3, 2));
      this.a(ly.D, gou.d::new);
      this.a(ly.E, gqq.a::new);
      this.a(ly.F, gov.a::new);
      this.a(ly.G, gqc.c::new);
      this.a(ly.K, gqb.a::new);
      this.a(ly.L, gpt.a::new);
      this.a(ly.M, gpu.a::new);
      this.a(ly.O, gqb.b::new);
      this.a(ly.N, gov.a::new);
      this.a(ly.P, gou.a::new);
      this.a(ly.Q, gqi.d::new);
      this.a(ly.S, gpb.b::new);
      this.a(ly.T, gqc.a::new);
      this.a(ly.U, new god.c());
      this.a(ly.X, new god.d());
      this.a(ly.Y, new god.a());
      this.a(ly.Z, new god.e());
      this.a(ly.aa, gpf.a::new);
      this.a(ly.ab, gpg.a::new);
      this.a(ly.ac, gqi.e::new);
      this.a(ly.au, gox.b::new);
      this.a(ly.ad, gpj.a::new);
      this.a(ly.ae, goq.a::new);
      this.a(ly.af, gpq.a::new);
      this.a(ly.ag, gqs.a::new);
      this.a(ly.ah, gpy.a::new);
      this.a(ly.ai, gqu.a::new);
      this.a(ly.aj, gpp.b::new);
      this.a(ly.aN, gpz.a::new);
      this.a(ly.ak, gqd.a::new);
      this.a(ly.am, goa.a::new);
      this.a(ly.an, gql.a::new);
      this.a(ly.al, gqg.b::new);
      this.a(ly.ao, gqh.c::new);
      this.a(ly.ap, gqe.a::new);
      this.a(ly.aq, gqc.d::new);
      this.a(ly.ay, gok::f);
      this.a(ly.az, gok::g);
      this.a(ly.aA, gok::h);
      this.a(ly.aB, gok::m);
      this.a(ly.aC, gok::n);
      this.a(ly.aG, gqh.b::new);
      this.a(ly.aD, gnz.a::new);
      this.a(ly.aE, gqh.a::new);
      this.a(ly.aF, gqh.d::new);
      this.a(ly.aH, gok::o);
      this.a(ly.aI, gok::p);
      this.a(ly.aJ, gok::q);
      this.a(ly.aK, gpr.a::new);
      this.a(ly.aL, gqt.a::new);
      this.a(ly.aM, gov.b::new);
      this.a(ly.aQ, gok::i);
      this.a(ly.aR, gok::j);
      this.a(ly.H, gos.a::new);
      this.a(ly.I, gos.b::new);
      this.a(ly.J, gos.c::new);
      this.a(ly.aO, gok::k);
      this.a(ly.aP, gok::l);
      this.a(ly.V, gqp.a::new);
      this.a(ly.W, gqn.a::new);
      this.a(ly.aS, gqg.a::new);
      this.a(ly.aT, goy.b::new);
      this.a(ly.aU, goy.e::new);
      this.a(ly.aV, goy.d::new);
      this.a(ly.aW, goy.a::new);
      this.a(ly.aX, goy.c::new);
      this.a(ly.aY, gpv.a::new);
      this.a(ly.aZ, gqi.c::new);
      this.a(ly.ba, goo.a::new);
      this.a(ly.bb, gqo.a::new);
      this.a(ly.bc, gqo.a::new);
      this.a(ly.bd, gox.c::new);
      this.a(ly.be, new gqj.b());
      this.a(ly.bg, gqc.c::new);
      this.a(ly.bh, gqc.c::new);
      this.a(ly.bf, gow.a::new);
      this.a(ly.bi, new gqj.a());
      this.a(ly.bj, got.a::new);
   }

   private <T extends lw> void a(lx<T> $$0, gpn<T> $$1) {
      this.i.put(mg.i.a($$0), $$1);
   }

   private <T extends lw> void a(lx<T> $$0, gpn.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            gqk $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends lw> void a(lx<T> $$0, gpm.c<T> $$1) {
      gpm.b $$2 = new gpm.b();
      this.k.put(mg.i.b($$0), $$2);
      this.i.put(mg.i.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> reload(auz.a $$0, avf $$1, Executor $$2, Executor $$3) {
      record a(ali a, Optional<List<ali>> b) {
      }

      CompletableFuture<List<a>> $$4 = CompletableFuture.<Map<ali, avd>>supplyAsync(() -> c.a($$1), $$2).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            ali $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$2));
         });
         return ag.d($$2x);
      });
      CompletableFuture<hkv.a> $$5 = hkv.a(this.l).a($$1, hmz.k, 0, $$2).thenCompose(hkv.a::a);
      return CompletableFuture.allOf($$5, $$4).thenCompose($$0::wait).thenAcceptAsync($$2x -> {
         this.e();
         brb $$3x = bra.a();
         $$3x.a("upload");
         hkv.a $$4x = $$5.join();
         this.l.a($$4x);
         $$3x.b("bindSpriteSets");
         Set<ali> $$5x = new HashSet<>();
         hla $$6 = $$4x.e();
         $$4.join().forEach($$3xx -> {
            Optional<List<ali>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<hla> $$5xx = new ArrayList<>();

               for (ali $$6x : $$4xx.get()) {
                  hla $$7 = $$4x.f().get($$6x);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(ali::toString).collect(Collectors.joining(",")));
         }

         $$3x.c();
      }, $$3);
   }

   public void a() {
      this.l.d();
   }

   private Optional<List<ali>> a(ali $$0, avd $$1) {
      if (!this.k.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               gpl $$3 = gpl.a(aze.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bwt $$0, lw $$1) {
      this.g.add(new gqm(this.a, $$0, $$1));
   }

   public void a(bwt $$0, lw $$1, int $$2) {
      this.g.add(new gqm(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public gpk a(lw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gpk $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends lw> gpk b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gpn<T> $$7 = (gpn<T>)this.i.get(mg.i.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(gpk $$0) {
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
         bra.a().a($$0.toString());
         this.a($$1x);
         bra.a().c();
      });
      if (!this.g.isEmpty()) {
         List<gqm> $$0 = Lists.newArrayList();

         for (gqm $$1 : this.g) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.g.removeAll($$0);
      }

      gpk $$2;
      if (!this.j.isEmpty()) {
         while (($$2 = this.j.poll()) != null) {
            this.f.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<gpk> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<gpk> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            gpk $$2 = $$1.next();
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

   private void b(gpk $$0) {
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

   public void a(fql $$0, float $$1, gsa.a $$2) {
      for (gpo $$3 : e) {
         Queue<gpk> $$4 = this.f.get($$3);
         if ($$4 != null && !$$4.isEmpty()) {
            a($$0, $$1, $$2, $$3, $$4);
         }
      }

      Queue<gpk> $$5 = this.f.get(gpo.d);
      if ($$5 != null && !$$5.isEmpty()) {
         a($$0, $$1, $$2, $$5);
      }

      $$2.b();
   }

   private static void a(fql $$0, float $$1, gsa.a $$2, gpo $$3, Queue<gpk> $$4) {
      flr $$5 = $$2.getBuffer(Objects.requireNonNull($$3.b()));

      for (gpk $$6 : $$4) {
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

   private static void a(fql $$0, float $$1, gsa.a $$2, Queue<gpk> $$3) {
      flo $$4 = new flo();

      for (gpk $$5 : $$3) {
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

   public void a(@Nullable gmb $$0) {
      this.a = $$0;
      this.e();
      this.g.clear();
   }

   public void a(iv $$0, ebe $$1) {
      if (!$$1.l() && $$1.D()) {
         fgk $$2 = $$1.f(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, azo.c($$8 / 0.25));
               int $$12 = Math.max(2, azo.c($$9 / 0.25));
               int $$13 = Math.max(2, azo.c($$10 / 0.25));

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
                           new gqj(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(iv $$0, jb $$1) {
      ebe $$2 = this.a.a_($$0);
      if ($$2.o() != dtp.a && $$2.D()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         ffl $$7 = $$2.f(this.a, $$0).a();
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

         this.a(new gqj(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
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

   static class b implements gqf {
      private List<hla> a;

      @Override
      public hla a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public hla a(azx $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<hla> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends lw> {
      gpn<T> create(gqf var1);
   }
}
