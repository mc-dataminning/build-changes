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

public class glj implements aut {
   private static final Logger b = LogUtils.getLogger();
   private static final akw c = akw.a("particles");
   private static final ald d = ald.b("particles");
   private static final int e = 16384;
   private static final List<gll> f = List.of(gll.a, gll.b, gll.c);
   protected ghz a;
   private final Map<gll, Queue<glh>> g = Maps.newIdentityHashMap();
   private final Queue<gmj> h = Queues.newArrayDeque();
   private final hgu i;
   private final azs j = azs.a();
   private final Int2ObjectMap<glk<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<glh> l = Queues.newArrayDeque();
   private final Map<ald, glj.b> m = Maps.newHashMap();
   private final hgr n;
   private final Object2IntOpenHashMap<ls> o = new Object2IntOpenHashMap();

   public glj(ghz $$0, hgu $$1) {
      this.n = new hgr(hgr.e);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(lv.a, gky.a::new);
      this.a(lv.c, new gka.a());
      this.a(lv.b, new gmg.c());
      this.a(lv.d, gkd.a::new);
      this.a(lv.at, gkc.a::new);
      this.a(lv.ar, gke.a::new);
      this.a(lv.aw, gkf.a::new);
      this.a(lv.ax, gkf.b::new);
      this.a(lv.e, glm.a::new);
      this.a(lv.R, gmf.a::new);
      this.a(lv.f, gkg.c::new);
      this.a(lv.as, gmo.a::new);
      this.a(lv.g, gkg.a::new);
      this.a(lv.h, gkh.a::new);
      this.a(lv.av, gmf.b::new);
      this.a(lv.i, gki::c);
      this.a(lv.j, gki::d);
      this.a(lv.k, gki::e);
      this.a(lv.l, gki::a);
      this.a(lv.m, gki::b);
      this.a(lv.n, gkk.a::new);
      this.a(lv.o, gkj.a::new);
      this.a(lv.p, glz.c::new);
      this.a(lv.q, new gle.a());
      this.a(lv.r, gkg.b::new);
      this.a(lv.s, gku.a::new);
      this.a(lv.t, gkn.a::new);
      this.a(lv.u, glz.b::new);
      this.a(lv.v, new gla.a());
      this.a(lv.w, gkz.a::new);
      this.a(lv.B, glx.a::new);
      this.a(lv.C, gkp.a::new);
      this.a(lv.x, gkw.a::new);
      this.a(lv.y, gkw.b::new);
      this.a(lv.z, new gkx.a(3.0, 7, 0));
      this.a(lv.A, new gkx.a(1.0, 3, 2));
      this.a(lv.D, gkr.d::new);
      this.a(lv.E, gmn.a::new);
      this.a(lv.F, gks.a::new);
      this.a(lv.G, glz.c::new);
      this.a(lv.K, gly.a::new);
      this.a(lv.L, glq.a::new);
      this.a(lv.M, glr.a::new);
      this.a(lv.O, gly.b::new);
      this.a(lv.N, gks.a::new);
      this.a(lv.P, gkr.a::new);
      this.a(lv.Q, gmf.d::new);
      this.a(lv.S, gky.b::new);
      this.a(lv.T, glz.a::new);
      this.a(lv.U, new gkb.c());
      this.a(lv.X, new gkb.d());
      this.a(lv.Y, new gkb.a());
      this.a(lv.Z, new gkb.e());
      this.a(lv.aa, glc.a::new);
      this.a(lv.ab, gld.a::new);
      this.a(lv.ac, gmf.e::new);
      this.a(lv.au, gku.b::new);
      this.a(lv.ad, glg.a::new);
      this.a(lv.ae, gko.a::new);
      this.a(lv.af, gln.a::new);
      this.a(lv.ag, gmp.a::new);
      this.a(lv.ah, glv.a::new);
      this.a(lv.ai, gmr.a::new);
      this.a(lv.aj, glm.b::new);
      this.a(lv.aN, glw.a::new);
      this.a(lv.ak, gma.a::new);
      this.a(lv.am, gjy.a::new);
      this.a(lv.an, gmi.a::new);
      this.a(lv.al, gmd.b::new);
      this.a(lv.ao, gme.c::new);
      this.a(lv.ap, gmb.a::new);
      this.a(lv.aq, glz.d::new);
      this.a(lv.ay, gki::f);
      this.a(lv.az, gki::g);
      this.a(lv.aA, gki::h);
      this.a(lv.aB, gki::m);
      this.a(lv.aC, gki::n);
      this.a(lv.aG, gme.b::new);
      this.a(lv.aD, gjx.a::new);
      this.a(lv.aE, gme.a::new);
      this.a(lv.aF, gme.d::new);
      this.a(lv.aH, gki::o);
      this.a(lv.aI, gki::p);
      this.a(lv.aJ, gki::q);
      this.a(lv.aK, glo.a::new);
      this.a(lv.aL, gmq.a::new);
      this.a(lv.aM, gks.b::new);
      this.a(lv.aQ, gki::i);
      this.a(lv.aR, gki::j);
      this.a(lv.H, gkq.a::new);
      this.a(lv.I, gkq.b::new);
      this.a(lv.J, gkq.c::new);
      this.a(lv.aO, gki::k);
      this.a(lv.aP, gki::l);
      this.a(lv.V, gmm.a::new);
      this.a(lv.W, gmk.a::new);
      this.a(lv.aS, gmd.a::new);
      this.a(lv.aT, gkv.b::new);
      this.a(lv.aU, gkv.e::new);
      this.a(lv.aV, gkv.d::new);
      this.a(lv.aW, gkv.a::new);
      this.a(lv.aX, gkv.c::new);
      this.a(lv.aY, gls.a::new);
      this.a(lv.aZ, gmf.c::new);
      this.a(lv.ba, gkm.a::new);
      this.a(lv.bb, gml.a::new);
      this.a(lv.bc, gml.a::new);
      this.a(lv.bd, gku.c::new);
      this.a(lv.be, new gmg.b());
      this.a(lv.bg, glz.c::new);
      this.a(lv.bh, glz.c::new);
      this.a(lv.bf, gkt.a::new);
      this.a(lv.bi, new gmg.a());
   }

   private <T extends lt> void a(lu<T> $$0, glk<T> $$1) {
      this.k.put(md.i.a($$0), $$1);
   }

   private <T extends lt> void a(lu<T> $$0, glk.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            gmh $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends lt> void a(lu<T> $$0, glj.c<T> $$1) {
      glj.b $$2 = new glj.b();
      this.m.put(md.i.b($$0), $$2);
      this.k.put(md.i.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(aut.a $$0, ava $$1, Executor $$2, Executor $$3) {
      record a(ald a, Optional<List<ald>> b) {
      }

      CompletableFuture<List<a>> $$4 = CompletableFuture.<Map<ald, auy>>supplyAsync(() -> c.a($$1), $$2).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            ald $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$2));
         });
         return af.d($$2x);
      });
      CompletableFuture<hgn.a> $$5 = hgn.a(this.n).a($$1, d, 0, $$2).thenCompose(hgn.a::a);
      return CompletableFuture.allOf($$5, $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> {
         this.f();
         bqb $$3x = bqa.a();
         $$3x.a("upload");
         hgn.a $$4x = $$5.join();
         this.n.a($$4x);
         $$3x.b("bindSpriteSets");
         Set<ald> $$5x = new HashSet<>();
         hgs $$6 = $$4x.e();
         $$4.join().forEach($$3xx -> {
            Optional<List<ald>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<hgs> $$5xx = new ArrayList<>();

               for (ald $$6x : $$4xx.get()) {
                  hgs $$7 = $$4x.f().get($$6x);
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

               this.m.get($$3xx.a()).a($$5xx);
            }
         });
         if (!$$5x.isEmpty()) {
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(ald::toString).collect(Collectors.joining(",")));
         }

         $$3x.c();
      }, $$3);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<ald>> a(ald $$0, auy $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               gli $$3 = gli.a(aza.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bvs $$0, lt $$1) {
      this.h.add(new gmj(this.a, $$0, $$1));
   }

   public void a(bvs $$0, lt $$1, int $$2) {
      this.h.add(new gmj(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public glh a(lt $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      glh $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends lt> glh b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      glk<T> $$7 = (glk<T>)this.k.get(md.i.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(glh $$0) {
      Optional<ls> $$1 = $$0.o();
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
         bqa.a().a($$0.toString());
         this.a($$1x);
         bqa.a().c();
      });
      if (!this.h.isEmpty()) {
         List<gmj> $$0 = Lists.newArrayList();

         for (gmj $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      glh $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<glh> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<glh> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            glh $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(ls $$0, int $$1) {
      this.o.addTo($$0, $$1);
   }

   private void b(glh $$0) {
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

   public void a(fml $$0, float $$1, gny.a $$2) {
      for (gll $$3 : f) {
         Queue<glh> $$4 = this.g.get($$3);
         if ($$4 != null && !$$4.isEmpty()) {
            a($$0, $$1, $$2, $$3, $$4);
         }
      }

      Queue<glh> $$5 = this.g.get(gll.d);
      if ($$5 != null && !$$5.isEmpty()) {
         a($$0, $$1, $$2, $$5);
      }

      $$2.b();
   }

   private static void a(fml $$0, float $$1, gny.a $$2, gll $$3, Queue<glh> $$4) {
      fhs $$5 = $$2.getBuffer(Objects.requireNonNull($$3.b()));

      for (glh $$6 : $$4) {
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

   private static void a(fml $$0, float $$1, gny.a $$2, Queue<glh> $$3) {
      fho $$4 = new fho();

      for (glh $$5 : $$3) {
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

   public void a(@Nullable ghz $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(jj $$0, dym $$1) {
      if (!$$1.l() && $$1.D()) {
         fdo $$2 = $$1.f(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, azk.c($$8 / 0.25));
               int $$12 = Math.max(2, azk.c($$9 / 0.25));
               int $$13 = Math.max(2, azk.c($$10 / 0.25));

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
                           new gmg(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(jj $$0, jo $$1) {
      dym $$2 = this.a.a_($$0);
      if ($$2.o() != drf.a && $$2.D()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         fcp $$7 = $$2.f(this.a, $$0).a();
         double $$8 = (double)$$3 + this.j.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.j.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.j.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == jo.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == jo.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == jo.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == jo.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == jo.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == jo.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new gmg(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(ls $$0) {
      return this.o.getInt($$0) < $$0.a();
   }

   private void f() {
      this.g.clear();
      this.l.clear();
      this.h.clear();
      this.o.clear();
   }

   static class b implements gmc {
      private List<hgs> a;

      @Override
      public hgs a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public hgs a(azs $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<hgs> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends lt> {
      glk<T> create(gmc var1);
   }
}
