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

public class gbt implements atq {
   private static final Logger b = LogUtils.getLogger();
   private static final akd c = akd.a("particles");
   private static final akk d = new akk("particles");
   private static final int e = 16384;
   private static final List<gbv> f = ImmutableList.of(gbv.a, gbv.b, gbv.d, gbv.c, gbv.e);
   protected fyj a;
   private final Map<gbv, Queue<gbr>> g = Maps.newIdentityHashMap();
   private final Queue<gct> h = Queues.newArrayDeque();
   private final gpp i;
   private final ayo j = ayo.a();
   private final Int2ObjectMap<gbu<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<gbr> l = Queues.newArrayDeque();
   private final Map<akk, gbt.b> m = Maps.newHashMap();
   private final gpn n;
   private final Object2IntOpenHashMap<lg> o = new Object2IntOpenHashMap();

   public gbt(fyj $$0, gpp $$1) {
      this.n = new gpn(gpn.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(lj.a, gbi.a::new);
      this.a(lj.c, new gak.a());
      this.a(lj.b, new gcq.b());
      this.a(lj.d, gan.a::new);
      this.a(lj.aq, gam.a::new);
      this.a(lj.ao, gao.a::new);
      this.a(lj.at, gap.a::new);
      this.a(lj.au, gap.b::new);
      this.a(lj.e, gbw.a::new);
      this.a(lj.P, gcp.a::new);
      this.a(lj.f, gar.c::new);
      this.a(lj.ap, gcx.a::new);
      this.a(lj.g, gar.a::new);
      this.a(lj.h, gas.a::new);
      this.a(lj.as, gcp.b::new);
      this.a(lj.i, gat::c);
      this.a(lj.j, gat::d);
      this.a(lj.k, gat::e);
      this.a(lj.l, gat::a);
      this.a(lj.m, gat::b);
      this.a(lj.n, gav.a::new);
      this.a(lj.o, gau.a::new);
      this.a(lj.p, gcj.c::new);
      this.a(lj.q, new gbo.a());
      this.a(lj.r, gar.b::new);
      this.a(lj.s, gbe.a::new);
      this.a(lj.t, gay.a::new);
      this.a(lj.u, gcj.b::new);
      this.a(lj.v, new gbk.a());
      this.a(lj.w, gbj.a::new);
      this.a(lj.B, gch.a::new);
      this.a(lj.C, gba.a::new);
      this.a(lj.x, gbg.a::new);
      this.a(lj.y, gbg.b::new);
      this.a(lj.z, new gbh.a(3.0, 7, 0));
      this.a(lj.A, new gbh.a(1.0, 3, 2));
      this.a(lj.D, gbb.d::new);
      this.a(lj.E, gcw.a::new);
      this.a(lj.F, gbc.a::new);
      this.a(lj.G, gcj.c::new);
      this.a(lj.I, gci.a::new);
      this.a(lj.J, gca.a::new);
      this.a(lj.K, gcb.a::new);
      this.a(lj.M, gci.b::new);
      this.a(lj.L, gbc.a::new);
      this.a(lj.N, gbb.a::new);
      this.a(lj.O, gcp.d::new);
      this.a(lj.Q, gbi.b::new);
      this.a(lj.R, gcj.a::new);
      this.a(lj.S, new gal.b());
      this.a(lj.U, new gal.c());
      this.a(lj.V, new gal.a());
      this.a(lj.W, new gal.d());
      this.a(lj.X, gbm.a::new);
      this.a(lj.Y, gbn.a::new);
      this.a(lj.Z, gcp.e::new);
      this.a(lj.ar, gbe.b::new);
      this.a(lj.aa, gbq.a::new);
      this.a(lj.ab, gaz.a::new);
      this.a(lj.ac, gbx.a::new);
      this.a(lj.ad, gcy.a::new);
      this.a(lj.ae, gcf.a::new);
      this.a(lj.af, gda.a::new);
      this.a(lj.ag, gbw.b::new);
      this.a(lj.aK, gcg.a::new);
      this.a(lj.ah, gck.a::new);
      this.a(lj.aj, gai.a::new);
      this.a(lj.ak, gcs.a::new);
      this.a(lj.ai, gcn.b::new);
      this.a(lj.al, gco.c::new);
      this.a(lj.am, gcl.a::new);
      this.a(lj.an, gcj.d::new);
      this.a(lj.av, gat::f);
      this.a(lj.aw, gat::g);
      this.a(lj.ax, gat::h);
      this.a(lj.ay, gat::m);
      this.a(lj.az, gat::n);
      this.a(lj.aD, gco.b::new);
      this.a(lj.aA, gah.a::new);
      this.a(lj.aB, gco.a::new);
      this.a(lj.aC, gco.d::new);
      this.a(lj.aE, gat::o);
      this.a(lj.aF, gat::p);
      this.a(lj.aG, gat::q);
      this.a(lj.aH, gby.a::new);
      this.a(lj.aI, gcz.a::new);
      this.a(lj.aJ, gbc.b::new);
      this.a(lj.aN, gat::i);
      this.a(lj.aO, gat::j);
      this.a(lj.H, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new gaq($$2, $$3, $$4, $$5, $$0));
      this.a(lj.aL, gat::k);
      this.a(lj.aM, gat::l);
      this.a(lj.T, gcv.a::new);
      this.a(lj.aP, gcn.a::new);
      this.a(lj.aQ, gbf.b::new);
      this.a(lj.aR, gbf.e::new);
      this.a(lj.aS, gbf.d::new);
      this.a(lj.aT, gbf.a::new);
      this.a(lj.aU, gbf.c::new);
      this.a(lj.aV, gcc.a::new);
      this.a(lj.aW, gcp.c::new);
      this.a(lj.aX, gax.a::new);
      this.a(lj.aY, gcu.a::new);
      this.a(lj.aZ, gcu.a::new);
      this.a(lj.ba, gbe.c::new);
      this.a(lj.bb, new gcq.a());
      this.a(lj.bd, gcj.c::new);
      this.a(lj.be, gcj.c::new);
      this.a(lj.bc, gbd.a::new);
   }

   private <T extends lh> void a(li<T> $$0, gbu<T> $$1) {
      this.k.put(lq.i.a($$0), $$1);
   }

   private <T extends lh> void a(li<T> $$0, gbu.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            gcr $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends lh> void a(li<T> $$0, gbt.c<T> $$1) {
      gbt.b $$2 = new gbt.b();
      this.m.put(lq.i.b($$0), $$2);
      this.k.put(lq.i.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(atq.a $$0, atw $$1, bmu $$2, bmu $$3, Executor $$4, Executor $$5) {
      record a(akk a, Optional<List<akk>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<akk, atu>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            akk $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ac.d($$2x);
      });
      CompletableFuture<gpj.a> $$7 = gpj.a(this.n).a($$1, d, 0, $$4).thenCompose(gpj.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         gpj.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<akk> $$5x = new HashSet<>();
         gpo $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<akk>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<gpo> $$5xx = new ArrayList<>();

               for (akk $$6xx : $$4xx.get()) {
                  gpo $$7x = $$4x.f().get($$6xx);
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

   private Optional<List<akk>> a(akk $$0, atu $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               gbs $$3 = gbs.a(axw.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bsg $$0, lh $$1) {
      this.h.add(new gct(this.a, $$0, $$1));
   }

   public void a(bsg $$0, lh $$1, int $$2) {
      this.h.add(new gct(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public gbr a(lh $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gbr $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends lh> gbr b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gbu<T> $$7 = (gbu<T>)this.k.get(lq.i.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(gbr $$0) {
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
         List<gct> $$0 = Lists.newArrayList();

         for (gct $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      gbr $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<gbr> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<gbr> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            gbr $$2 = $$1.next();
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

   private void b(gbr $$0) {
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

   public void a(gec $$0, ffe $$1, float $$2) {
      $$0.c();
      RenderSystem.enableDepthTest();

      for (gbv $$3 : f) {
         Iterable<gbr> $$4 = this.g.get($$3);
         if ($$4 != null) {
            RenderSystem.setShader(gdw::t);
            fao $$5 = fao.b();
            fah $$6 = $$5.d();
            $$3.a($$6, this.i);

            for (gbr $$7 : $$4) {
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

   public void a(@Nullable fyj $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(ja $$0, dsk $$1) {
      if (!$$1.i() && $$1.z()) {
         ewy $$2 = $$1.j(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, ayg.c($$8 / 0.25));
               int $$12 = Math.max(2, ayg.c($$9 / 0.25));
               int $$13 = Math.max(2, ayg.c($$10 / 0.25));

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
                           new gcq(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(ja $$0, jf $$1) {
      dsk $$2 = this.a.a_($$0);
      if ($$2.l() != dln.a && $$2.z()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         ewa $$7 = $$2.j(this.a, $$0).a();
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

         this.a(new gcq(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
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

   static class b implements gcm {
      private List<gpo> a;

      @Override
      public gpo a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public gpo a(ayo $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<gpo> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends lh> {
      gbu<T> create(gcm var1);
   }
}
