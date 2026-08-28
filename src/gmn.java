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

public class gmn implements auu {
   private static final Logger b = LogUtils.getLogger();
   private static final akx c = akx.a("particles");
   private static final int d = 16384;
   private static final List<gmp> e = List.of(gmp.a, gmp.b, gmp.c);
   protected gjd a;
   private final Map<gmp, Queue<gml>> f = Maps.newIdentityHashMap();
   private final Queue<gnn> g = Queues.newArrayDeque();
   private final azt h = azt.a();
   private final Int2ObjectMap<gmo<?>> i = new Int2ObjectOpenHashMap();
   private final Queue<gml> j = Queues.newArrayDeque();
   private final Map<ale, gmn.b> k = Maps.newHashMap();
   private final hhy l;
   private final Object2IntOpenHashMap<lu> m = new Object2IntOpenHashMap();

   public gmn(gjd $$0, hib $$1) {
      this.l = new hhy(hhy.e);
      $$1.a(this.l.g(), this.l);
      this.a = $$0;
      this.e();
   }

   private void e() {
      this.a(lx.a, gmc.a::new);
      this.a(lx.c, new gle.a());
      this.a(lx.b, new gnk.c());
      this.a(lx.d, glh.a::new);
      this.a(lx.at, glg.a::new);
      this.a(lx.ar, gli.a::new);
      this.a(lx.aw, glj.a::new);
      this.a(lx.ax, glj.b::new);
      this.a(lx.e, gmq.a::new);
      this.a(lx.R, gnj.a::new);
      this.a(lx.f, glk.c::new);
      this.a(lx.as, gns.a::new);
      this.a(lx.g, glk.a::new);
      this.a(lx.h, gll.a::new);
      this.a(lx.av, gnj.b::new);
      this.a(lx.i, glm::c);
      this.a(lx.j, glm::d);
      this.a(lx.k, glm::e);
      this.a(lx.l, glm::a);
      this.a(lx.m, glm::b);
      this.a(lx.n, glo.a::new);
      this.a(lx.o, gln.a::new);
      this.a(lx.p, gnd.c::new);
      this.a(lx.q, new gmi.a());
      this.a(lx.r, glk.b::new);
      this.a(lx.s, gly.a::new);
      this.a(lx.t, glr.a::new);
      this.a(lx.u, gnd.b::new);
      this.a(lx.v, new gme.a());
      this.a(lx.w, gmd.a::new);
      this.a(lx.B, gnb.a::new);
      this.a(lx.C, glt.a::new);
      this.a(lx.x, gma.a::new);
      this.a(lx.y, gma.b::new);
      this.a(lx.z, new gmb.a(3.0, 7, 0));
      this.a(lx.A, new gmb.a(1.0, 3, 2));
      this.a(lx.D, glv.d::new);
      this.a(lx.E, gnr.a::new);
      this.a(lx.F, glw.a::new);
      this.a(lx.G, gnd.c::new);
      this.a(lx.K, gnc.a::new);
      this.a(lx.L, gmu.a::new);
      this.a(lx.M, gmv.a::new);
      this.a(lx.O, gnc.b::new);
      this.a(lx.N, glw.a::new);
      this.a(lx.P, glv.a::new);
      this.a(lx.Q, gnj.d::new);
      this.a(lx.S, gmc.b::new);
      this.a(lx.T, gnd.a::new);
      this.a(lx.U, new glf.c());
      this.a(lx.X, new glf.d());
      this.a(lx.Y, new glf.a());
      this.a(lx.Z, new glf.e());
      this.a(lx.aa, gmg.a::new);
      this.a(lx.ab, gmh.a::new);
      this.a(lx.ac, gnj.e::new);
      this.a(lx.au, gly.b::new);
      this.a(lx.ad, gmk.a::new);
      this.a(lx.ae, gls.a::new);
      this.a(lx.af, gmr.a::new);
      this.a(lx.ag, gnt.a::new);
      this.a(lx.ah, gmz.a::new);
      this.a(lx.ai, gnv.a::new);
      this.a(lx.aj, gmq.b::new);
      this.a(lx.aN, gna.a::new);
      this.a(lx.ak, gne.a::new);
      this.a(lx.am, glc.a::new);
      this.a(lx.an, gnm.a::new);
      this.a(lx.al, gnh.b::new);
      this.a(lx.ao, gni.c::new);
      this.a(lx.ap, gnf.a::new);
      this.a(lx.aq, gnd.d::new);
      this.a(lx.ay, glm::f);
      this.a(lx.az, glm::g);
      this.a(lx.aA, glm::h);
      this.a(lx.aB, glm::m);
      this.a(lx.aC, glm::n);
      this.a(lx.aG, gni.b::new);
      this.a(lx.aD, glb.a::new);
      this.a(lx.aE, gni.a::new);
      this.a(lx.aF, gni.d::new);
      this.a(lx.aH, glm::o);
      this.a(lx.aI, glm::p);
      this.a(lx.aJ, glm::q);
      this.a(lx.aK, gms.a::new);
      this.a(lx.aL, gnu.a::new);
      this.a(lx.aM, glw.b::new);
      this.a(lx.aQ, glm::i);
      this.a(lx.aR, glm::j);
      this.a(lx.H, glu.a::new);
      this.a(lx.I, glu.b::new);
      this.a(lx.J, glu.c::new);
      this.a(lx.aO, glm::k);
      this.a(lx.aP, glm::l);
      this.a(lx.V, gnq.a::new);
      this.a(lx.W, gno.a::new);
      this.a(lx.aS, gnh.a::new);
      this.a(lx.aT, glz.b::new);
      this.a(lx.aU, glz.e::new);
      this.a(lx.aV, glz.d::new);
      this.a(lx.aW, glz.a::new);
      this.a(lx.aX, glz.c::new);
      this.a(lx.aY, gmw.a::new);
      this.a(lx.aZ, gnj.c::new);
      this.a(lx.ba, glq.a::new);
      this.a(lx.bb, gnp.a::new);
      this.a(lx.bc, gnp.a::new);
      this.a(lx.bd, gly.c::new);
      this.a(lx.be, new gnk.b());
      this.a(lx.bg, gnd.c::new);
      this.a(lx.bh, gnd.c::new);
      this.a(lx.bf, glx.a::new);
      this.a(lx.bi, new gnk.a());
   }

   private <T extends lv> void a(lw<T> $$0, gmo<T> $$1) {
      this.i.put(mf.i.a($$0), $$1);
   }

   private <T extends lv> void a(lw<T> $$0, gmo.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            gnl $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends lv> void a(lw<T> $$0, gmn.c<T> $$1) {
      gmn.b $$2 = new gmn.b();
      this.k.put(mf.i.b($$0), $$2);
      this.i.put(mf.i.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(auu.a $$0, avb $$1, Executor $$2, Executor $$3) {
      record a(ale a, Optional<List<ale>> b) {
      }

      CompletableFuture<List<a>> $$4 = CompletableFuture.<Map<ale, auz>>supplyAsync(() -> c.a($$1), $$2).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            ale $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$2));
         });
         return af.d($$2x);
      });
      CompletableFuture<hhu.a> $$5 = hhu.a(this.l).a($$1, hjx.k, 0, $$2).thenCompose(hhu.a::a);
      return CompletableFuture.allOf($$5, $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> {
         this.f();
         bqj $$3x = bqi.a();
         $$3x.a("upload");
         hhu.a $$4x = $$5.join();
         this.l.a($$4x);
         $$3x.b("bindSpriteSets");
         Set<ale> $$5x = new HashSet<>();
         hhz $$6 = $$4x.e();
         $$4.join().forEach($$3xx -> {
            Optional<List<ale>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<hhz> $$5xx = new ArrayList<>();

               for (ale $$6x : $$4xx.get()) {
                  hhz $$7 = $$4x.f().get($$6x);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(ale::toString).collect(Collectors.joining(",")));
         }

         $$3x.c();
      }, $$3);
   }

   public void a() {
      this.l.f();
   }

   private Optional<List<ale>> a(ale $$0, auz $$1) {
      if (!this.k.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               gmm $$3 = gmm.a(aza.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bwa $$0, lv $$1) {
      this.g.add(new gnn(this.a, $$0, $$1));
   }

   public void a(bwa $$0, lv $$1, int $$2) {
      this.g.add(new gnn(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public gml a(lv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gml $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends lv> gml b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gmo<T> $$7 = (gmo<T>)this.i.get(mf.i.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(gml $$0) {
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
         bqi.a().a($$0.toString());
         this.a($$1x);
         bqi.a().c();
      });
      if (!this.g.isEmpty()) {
         List<gnn> $$0 = Lists.newArrayList();

         for (gnn $$1 : this.g) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.g.removeAll($$0);
      }

      gml $$2;
      if (!this.j.isEmpty()) {
         while (($$2 = this.j.poll()) != null) {
            this.f.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<gml> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<gml> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            gml $$2 = $$1.next();
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

   private void b(gml $$0) {
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

   public void a(fnn $$0, float $$1, gpd.a $$2) {
      for (gmp $$3 : e) {
         Queue<gml> $$4 = this.f.get($$3);
         if ($$4 != null && !$$4.isEmpty()) {
            a($$0, $$1, $$2, $$3, $$4);
         }
      }

      Queue<gml> $$5 = this.f.get(gmp.d);
      if ($$5 != null && !$$5.isEmpty()) {
         a($$0, $$1, $$2, $$5);
      }

      $$2.b();
   }

   private static void a(fnn $$0, float $$1, gpd.a $$2, gmp $$3, Queue<gml> $$4) {
      fiu $$5 = $$2.getBuffer(Objects.requireNonNull($$3.b()));

      for (gml $$6 : $$4) {
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

   private static void a(fnn $$0, float $$1, gpd.a $$2, Queue<gml> $$3) {
      fiq $$4 = new fiq();

      for (gml $$5 : $$3) {
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

   public void a(@Nullable gjd $$0) {
      this.a = $$0;
      this.f();
      this.g.clear();
   }

   public void a(iu $$0, dzo $$1) {
      if (!$$1.l() && $$1.D()) {
         feq $$2 = $$1.f(this.a, $$0);
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
                           new gnk(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(iu $$0, ja $$1) {
      dzo $$2 = this.a.a_($$0);
      if ($$2.o() != dsf.a && $$2.D()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         fdr $$7 = $$2.f(this.a, $$0).a();
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

         this.a(new gnk(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
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

   static class b implements gng {
      private List<hhz> a;

      @Override
      public hhz a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public hhz a(azt $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<hhz> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends lv> {
      gmo<T> create(gng var1);
   }
}
