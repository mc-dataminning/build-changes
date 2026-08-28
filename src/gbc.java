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

public class gbc implements aui {
   private static final Logger b = LogUtils.getLogger();
   private static final akx c = akx.a("particles");
   private static final ale d = new ale("particles");
   private static final int e = 16384;
   private static final List<gbe> f = ImmutableList.of(gbe.a, gbe.b, gbe.d, gbe.c, gbe.e);
   protected fxt a;
   private final Map<gbe, Queue<gba>> g = Maps.newIdentityHashMap();
   private final Queue<gcc> h = Queues.newArrayDeque();
   private final goy i;
   private final azf j = azf.a();
   private final Int2ObjectMap<gbd<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<gba> l = Queues.newArrayDeque();
   private final Map<ale, gbc.b> m = Maps.newHashMap();
   private final gow n;
   private final Object2IntOpenHashMap<lf> o = new Object2IntOpenHashMap();

   public gbc(fxt $$0, goy $$1) {
      this.n = new gow(gow.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(li.a, gar.a::new);
      this.a(li.c, new fzt.a());
      this.a(li.b, new gbz.b());
      this.a(li.d, fzw.a::new);
      this.a(li.aq, fzv.a::new);
      this.a(li.ao, fzx.a::new);
      this.a(li.at, fzy.a::new);
      this.a(li.au, fzy.b::new);
      this.a(li.e, gbf.a::new);
      this.a(li.P, gby.a::new);
      this.a(li.f, gaa.c::new);
      this.a(li.ap, gcg.a::new);
      this.a(li.g, gaa.a::new);
      this.a(li.h, gab.a::new);
      this.a(li.as, gby.b::new);
      this.a(li.i, gac::c);
      this.a(li.j, gac::d);
      this.a(li.k, gac::e);
      this.a(li.l, gac::a);
      this.a(li.m, gac::b);
      this.a(li.n, gae.a::new);
      this.a(li.o, gad.a::new);
      this.a(li.p, gbs.c::new);
      this.a(li.q, new gax.a());
      this.a(li.r, gaa.b::new);
      this.a(li.s, gan.a::new);
      this.a(li.t, gah.a::new);
      this.a(li.u, gbs.b::new);
      this.a(li.v, new gat.a());
      this.a(li.w, gas.a::new);
      this.a(li.B, gbq.a::new);
      this.a(li.C, gaj.a::new);
      this.a(li.x, gap.a::new);
      this.a(li.y, gap.b::new);
      this.a(li.z, new gaq.a(3.0, 7, 0));
      this.a(li.A, new gaq.a(1.0, 3, 2));
      this.a(li.D, gak.d::new);
      this.a(li.E, gcf.a::new);
      this.a(li.F, gal.a::new);
      this.a(li.G, gbs.c::new);
      this.a(li.I, gbr.a::new);
      this.a(li.J, gbj.a::new);
      this.a(li.K, gbk.a::new);
      this.a(li.M, gbr.b::new);
      this.a(li.L, gal.a::new);
      this.a(li.N, gak.a::new);
      this.a(li.O, gby.d::new);
      this.a(li.Q, gar.b::new);
      this.a(li.R, gbs.a::new);
      this.a(li.S, new fzu.b());
      this.a(li.U, new fzu.c());
      this.a(li.V, new fzu.a());
      this.a(li.W, new fzu.d());
      this.a(li.X, gav.a::new);
      this.a(li.Y, gaw.a::new);
      this.a(li.Z, gby.e::new);
      this.a(li.ar, gan.b::new);
      this.a(li.aa, gaz.a::new);
      this.a(li.ab, gai.a::new);
      this.a(li.ac, gbg.a::new);
      this.a(li.ad, gch.a::new);
      this.a(li.ae, gbo.a::new);
      this.a(li.af, gcj.a::new);
      this.a(li.ag, gbf.b::new);
      this.a(li.aK, gbp.a::new);
      this.a(li.ah, gbt.a::new);
      this.a(li.aj, fzr.a::new);
      this.a(li.ak, gcb.a::new);
      this.a(li.ai, gbw.b::new);
      this.a(li.al, gbx.c::new);
      this.a(li.am, gbu.a::new);
      this.a(li.an, gbs.d::new);
      this.a(li.av, gac::f);
      this.a(li.aw, gac::g);
      this.a(li.ax, gac::h);
      this.a(li.ay, gac::m);
      this.a(li.az, gac::n);
      this.a(li.aD, gbx.b::new);
      this.a(li.aA, fzq.a::new);
      this.a(li.aB, gbx.a::new);
      this.a(li.aC, gbx.d::new);
      this.a(li.aE, gac::o);
      this.a(li.aF, gac::p);
      this.a(li.aG, gac::q);
      this.a(li.aH, gbh.a::new);
      this.a(li.aI, gci.a::new);
      this.a(li.aJ, gal.b::new);
      this.a(li.aN, gac::i);
      this.a(li.aO, gac::j);
      this.a(li.H, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new fzz($$2, $$3, $$4, $$5, $$0));
      this.a(li.aL, gac::k);
      this.a(li.aM, gac::l);
      this.a(li.T, gce.a::new);
      this.a(li.aP, gbw.a::new);
      this.a(li.aQ, gao.b::new);
      this.a(li.aR, gao.e::new);
      this.a(li.aS, gao.d::new);
      this.a(li.aT, gao.a::new);
      this.a(li.aU, gao.c::new);
      this.a(li.aV, gbl.a::new);
      this.a(li.aW, gby.c::new);
      this.a(li.aX, gag.a::new);
      this.a(li.aY, gcd.a::new);
      this.a(li.aZ, gcd.a::new);
      this.a(li.ba, gan.c::new);
      this.a(li.bb, new gbz.a());
      this.a(li.bd, gbs.c::new);
      this.a(li.be, gbs.c::new);
      this.a(li.bc, gam.a::new);
   }

   private <T extends lg> void a(lh<T> $$0, gbd<T> $$1) {
      this.k.put(lp.j.a($$0), $$1);
   }

   private <T extends lg> void a(lh<T> $$0, gbd.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            gca $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends lg> void a(lh<T> $$0, gbc.c<T> $$1) {
      gbc.b $$2 = new gbc.b();
      this.m.put(lp.j.b($$0), $$2);
      this.k.put(lp.j.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(aui.a $$0, auo $$1, bng $$2, bng $$3, Executor $$4, Executor $$5) {
      record a(ale a, Optional<List<ale>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<ale, aum>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            ale $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ac.d($$2x);
      });
      CompletableFuture<gos.a> $$7 = gos.a(this.n).a($$1, d, 0, $$4).thenCompose(gos.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         gos.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<ale> $$5x = new HashSet<>();
         gox $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<ale>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<gox> $$5xx = new ArrayList<>();

               for (ale $$6xx : $$4xx.get()) {
                  gox $$7x = $$4x.f().get($$6xx);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(ale::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<ale>> a(ale $$0, aum $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               gbb $$3 = gbb.a(ayn.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bss $$0, lg $$1) {
      this.h.add(new gcc(this.a, $$0, $$1));
   }

   public void a(bss $$0, lg $$1, int $$2) {
      this.h.add(new gcc(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public gba a(lg $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gba $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends lg> gba b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gbd<T> $$7 = (gbd<T>)this.k.get(lp.j.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(gba $$0) {
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
         List<gcc> $$0 = Lists.newArrayList();

         for (gcc $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      gba $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<gba> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<gba> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            gba $$2 = $$1.next();
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

   private void b(gba $$0) {
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

   public void a(gdl $$0, feo $$1, float $$2) {
      $$0.c();
      RenderSystem.enableDepthTest();

      for (gbe $$3 : f) {
         Iterable<gba> $$4 = this.g.get($$3);
         if ($$4 != null) {
            RenderSystem.setShader(gdf::t);
            ezy $$5 = ezy.b();
            ezr $$6 = $$5.d();
            $$3.a($$6, this.i);

            for (gba $$7 : $$4) {
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

   public void a(@Nullable fxt $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(iz $$0, dsa $$1) {
      if (!$$1.i() && $$1.z()) {
         ewi $$2 = $$1.j(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, ayx.c($$8 / 0.25));
               int $$12 = Math.max(2, ayx.c($$9 / 0.25));
               int $$13 = Math.max(2, ayx.c($$10 / 0.25));

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
                           new gbz(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(iz $$0, je $$1) {
      dsa $$2 = this.a.a_($$0);
      if ($$2.l() != dld.a && $$2.z()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         evk $$7 = $$2.j(this.a, $$0).a();
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

         this.a(new gbz(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
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

   static class b implements gbv {
      private List<gox> a;

      @Override
      public gox a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public gox a(azf $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<gox> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends lg> {
      gbd<T> create(gbv var1);
   }
}
