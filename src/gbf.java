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

public class gbf implements auj {
   private static final Logger b = LogUtils.getLogger();
   private static final aky c = aky.a("particles");
   private static final alf d = new alf("particles");
   private static final int e = 16384;
   private static final List<gbh> f = ImmutableList.of(gbh.a, gbh.b, gbh.d, gbh.c, gbh.e);
   protected fxw a;
   private final Map<gbh, Queue<gbd>> g = Maps.newIdentityHashMap();
   private final Queue<gcf> h = Queues.newArrayDeque();
   private final gpb i;
   private final azh j = azh.a();
   private final Int2ObjectMap<gbg<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<gbd> l = Queues.newArrayDeque();
   private final Map<alf, gbf.b> m = Maps.newHashMap();
   private final goz n;
   private final Object2IntOpenHashMap<lf> o = new Object2IntOpenHashMap();

   public gbf(fxw $$0, gpb $$1) {
      this.n = new goz(goz.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(li.a, gau.a::new);
      this.a(li.c, new fzw.a());
      this.a(li.b, new gcc.b());
      this.a(li.d, fzz.a::new);
      this.a(li.aq, fzy.a::new);
      this.a(li.ao, gaa.a::new);
      this.a(li.at, gab.a::new);
      this.a(li.au, gab.b::new);
      this.a(li.e, gbi.a::new);
      this.a(li.P, gcb.a::new);
      this.a(li.f, gad.c::new);
      this.a(li.ap, gcj.a::new);
      this.a(li.g, gad.a::new);
      this.a(li.h, gae.a::new);
      this.a(li.as, gcb.b::new);
      this.a(li.i, gaf::c);
      this.a(li.j, gaf::d);
      this.a(li.k, gaf::e);
      this.a(li.l, gaf::a);
      this.a(li.m, gaf::b);
      this.a(li.n, gah.a::new);
      this.a(li.o, gag.a::new);
      this.a(li.p, gbv.c::new);
      this.a(li.q, new gba.a());
      this.a(li.r, gad.b::new);
      this.a(li.s, gaq.a::new);
      this.a(li.t, gak.a::new);
      this.a(li.u, gbv.b::new);
      this.a(li.v, new gaw.a());
      this.a(li.w, gav.a::new);
      this.a(li.B, gbt.a::new);
      this.a(li.C, gam.a::new);
      this.a(li.x, gas.a::new);
      this.a(li.y, gas.b::new);
      this.a(li.z, new gat.a(3.0, 7, 0));
      this.a(li.A, new gat.a(1.0, 3, 2));
      this.a(li.D, gan.d::new);
      this.a(li.E, gci.a::new);
      this.a(li.F, gao.a::new);
      this.a(li.G, gbv.c::new);
      this.a(li.I, gbu.a::new);
      this.a(li.J, gbm.a::new);
      this.a(li.K, gbn.a::new);
      this.a(li.M, gbu.b::new);
      this.a(li.L, gao.a::new);
      this.a(li.N, gan.a::new);
      this.a(li.O, gcb.d::new);
      this.a(li.Q, gau.b::new);
      this.a(li.R, gbv.a::new);
      this.a(li.S, new fzx.b());
      this.a(li.U, new fzx.c());
      this.a(li.V, new fzx.a());
      this.a(li.W, new fzx.d());
      this.a(li.X, gay.a::new);
      this.a(li.Y, gaz.a::new);
      this.a(li.Z, gcb.e::new);
      this.a(li.ar, gaq.b::new);
      this.a(li.aa, gbc.a::new);
      this.a(li.ab, gal.a::new);
      this.a(li.ac, gbj.a::new);
      this.a(li.ad, gck.a::new);
      this.a(li.ae, gbr.a::new);
      this.a(li.af, gcm.a::new);
      this.a(li.ag, gbi.b::new);
      this.a(li.aK, gbs.a::new);
      this.a(li.ah, gbw.a::new);
      this.a(li.aj, fzu.a::new);
      this.a(li.ak, gce.a::new);
      this.a(li.ai, gbz.b::new);
      this.a(li.al, gca.c::new);
      this.a(li.am, gbx.a::new);
      this.a(li.an, gbv.d::new);
      this.a(li.av, gaf::f);
      this.a(li.aw, gaf::g);
      this.a(li.ax, gaf::h);
      this.a(li.ay, gaf::m);
      this.a(li.az, gaf::n);
      this.a(li.aD, gca.b::new);
      this.a(li.aA, fzt.a::new);
      this.a(li.aB, gca.a::new);
      this.a(li.aC, gca.d::new);
      this.a(li.aE, gaf::o);
      this.a(li.aF, gaf::p);
      this.a(li.aG, gaf::q);
      this.a(li.aH, gbk.a::new);
      this.a(li.aI, gcl.a::new);
      this.a(li.aJ, gao.b::new);
      this.a(li.aN, gaf::i);
      this.a(li.aO, gaf::j);
      this.a(li.H, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new gac($$2, $$3, $$4, $$5, $$0));
      this.a(li.aL, gaf::k);
      this.a(li.aM, gaf::l);
      this.a(li.T, gch.a::new);
      this.a(li.aP, gbz.a::new);
      this.a(li.aQ, gar.b::new);
      this.a(li.aR, gar.e::new);
      this.a(li.aS, gar.d::new);
      this.a(li.aT, gar.a::new);
      this.a(li.aU, gar.c::new);
      this.a(li.aV, gbo.a::new);
      this.a(li.aW, gcb.c::new);
      this.a(li.aX, gaj.a::new);
      this.a(li.aY, gcg.a::new);
      this.a(li.aZ, gcg.a::new);
      this.a(li.ba, gaq.c::new);
      this.a(li.bb, new gcc.a());
      this.a(li.bd, gbv.c::new);
      this.a(li.be, gbv.c::new);
      this.a(li.bc, gap.a::new);
   }

   private <T extends lg> void a(lh<T> $$0, gbg<T> $$1) {
      this.k.put(lp.j.a($$0), $$1);
   }

   private <T extends lg> void a(lh<T> $$0, gbg.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            gcd $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends lg> void a(lh<T> $$0, gbf.c<T> $$1) {
      gbf.b $$2 = new gbf.b();
      this.m.put(lp.j.b($$0), $$2);
      this.k.put(lp.j.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(auj.a $$0, aup $$1, bnj $$2, bnj $$3, Executor $$4, Executor $$5) {
      record a(alf a, Optional<List<alf>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<alf, aun>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            alf $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ac.d($$2x);
      });
      CompletableFuture<gov.a> $$7 = gov.a(this.n).a($$1, d, 0, $$4).thenCompose(gov.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         gov.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<alf> $$5x = new HashSet<>();
         gpa $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<alf>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<gpa> $$5xx = new ArrayList<>();

               for (alf $$6xx : $$4xx.get()) {
                  gpa $$7x = $$4x.f().get($$6xx);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(alf::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<alf>> a(alf $$0, aun $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               gbe $$3 = gbe.a(ayp.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bsv $$0, lg $$1) {
      this.h.add(new gcf(this.a, $$0, $$1));
   }

   public void a(bsv $$0, lg $$1, int $$2) {
      this.h.add(new gcf(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public gbd a(lg $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gbd $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends lg> gbd b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gbg<T> $$7 = (gbg<T>)this.k.get(lp.j.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(gbd $$0) {
      Optional<lf> $$1 = $$0.o();
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
         List<gcf> $$0 = Lists.newArrayList();

         for (gcf $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      gbd $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<gbd> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<gbd> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            gbd $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(lf $$0, int $$1) {
      this.o.addTo($$0, $$1);
   }

   private void b(gbd $$0) {
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

   public void a(gdo $$0, fer $$1, float $$2) {
      $$0.c();
      RenderSystem.enableDepthTest();

      for (gbh $$3 : f) {
         Iterable<gbd> $$4 = this.g.get($$3);
         if ($$4 != null) {
            RenderSystem.setShader(gdi::t);
            fab $$5 = fab.b();
            ezu $$6 = $$5.d();
            $$3.a($$6, this.i);

            for (gbd $$7 : $$4) {
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

   public void a(@Nullable fxw $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(iz $$0, dsd $$1) {
      if (!$$1.i() && $$1.z()) {
         ewl $$2 = $$1.j(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, ayz.c($$8 / 0.25));
               int $$12 = Math.max(2, ayz.c($$9 / 0.25));
               int $$13 = Math.max(2, ayz.c($$10 / 0.25));

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
                           new gcc(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(iz $$0, je $$1) {
      dsd $$2 = this.a.a_($$0);
      if ($$2.l() != dlg.a && $$2.z()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         evn $$7 = $$2.j(this.a, $$0).a();
         double $$8 = (double)$$3 + this.j.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.j.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.j.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == je.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == je.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == je.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == je.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == je.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == je.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new gcc(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(lf $$0) {
      return this.o.getInt($$0) < $$0.a();
   }

   private void f() {
      this.g.clear();
      this.l.clear();
      this.h.clear();
      this.o.clear();
   }

   static class b implements gby {
      private List<gpa> a;

      @Override
      public gpa a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public gpa a(azh $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<gpa> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends lg> {
      gbg<T> create(gby var1);
   }
}
