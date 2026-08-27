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

public class fze implements atl {
   private static final Logger b = LogUtils.getLogger();
   private static final aka c = aka.a("particles");
   private static final akh d = new akh("particles");
   private static final int e = 16384;
   private static final List<fzg> f = ImmutableList.of(fzg.a, fzg.b, fzg.d, fzg.c, fzg.e);
   protected fvw a;
   private final Map<fzg, Queue<fzc>> g = Maps.newIdentityHashMap();
   private final Queue<gae> h = Queues.newArrayDeque();
   private final gmz i;
   private final ayg j = ayg.a();
   private final Int2ObjectMap<fzf<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<fzc> l = Queues.newArrayDeque();
   private final Map<akh, fze.b> m = Maps.newHashMap();
   private final gmx n;
   private final Object2IntOpenHashMap<ku> o = new Object2IntOpenHashMap();

   public fze(fvw $$0, gmz $$1) {
      this.n = new gmx(gmx.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(kx.a, fyt.a::new);
      this.a(kx.c, new fxw.a());
      this.a(kx.b, new gab.a());
      this.a(kx.d, fxz.a::new);
      this.a(kx.an, fxy.a::new);
      this.a(kx.al, fya.a::new);
      this.a(kx.aq, fyb.a::new);
      this.a(kx.ar, fyb.b::new);
      this.a(kx.e, fzh.a::new);
      this.a(kx.N, gaa.a::new);
      this.a(kx.f, fyd.c::new);
      this.a(kx.am, gai.a::new);
      this.a(kx.g, fyd.a::new);
      this.a(kx.h, fye.a::new);
      this.a(kx.ap, gaa.b::new);
      this.a(kx.i, fyf::c);
      this.a(kx.j, fyf::d);
      this.a(kx.k, fyf::e);
      this.a(kx.l, fyf::a);
      this.a(kx.m, fyf::b);
      this.a(kx.n, fyh.a::new);
      this.a(kx.o, fyg.a::new);
      this.a(kx.p, fzu.c::new);
      this.a(kx.q, new fyz.a());
      this.a(kx.r, fyd.b::new);
      this.a(kx.s, fyp.a::new);
      this.a(kx.t, fyk.a::new);
      this.a(kx.u, fzu.b::new);
      this.a(kx.v, new fyv.a());
      this.a(kx.w, fyu.a::new);
      this.a(kx.A, fzs.a::new);
      this.a(kx.B, fym.a::new);
      this.a(kx.x, fyr.a::new);
      this.a(kx.y, new fys.a(3.0, 7, 0));
      this.a(kx.z, new fys.a(1.0, 3, 2));
      this.a(kx.C, fyn.d::new);
      this.a(kx.D, gah.a::new);
      this.a(kx.E, fyo.a::new);
      this.a(kx.G, fzt.a::new);
      this.a(kx.H, fzl.a::new);
      this.a(kx.I, fzm.a::new);
      this.a(kx.K, fzt.b::new);
      this.a(kx.J, fyo.a::new);
      this.a(kx.L, fyn.a::new);
      this.a(kx.M, gaa.d::new);
      this.a(kx.O, fyt.b::new);
      this.a(kx.P, fzu.a::new);
      this.a(kx.Q, new fxx.a());
      this.a(kx.S, new fxx.b());
      this.a(kx.T, new fxx.c());
      this.a(kx.U, fyx.a::new);
      this.a(kx.V, fyy.a::new);
      this.a(kx.W, gaa.e::new);
      this.a(kx.ao, fyp.b::new);
      this.a(kx.X, fzb.a::new);
      this.a(kx.Y, fyl.a::new);
      this.a(kx.Z, fzi.a::new);
      this.a(kx.aa, gaj.a::new);
      this.a(kx.ab, fzq.a::new);
      this.a(kx.ac, gal.a::new);
      this.a(kx.ad, fzh.b::new);
      this.a(kx.aH, fzr.a::new);
      this.a(kx.ae, fzv.a::new);
      this.a(kx.ag, fxu.a::new);
      this.a(kx.ah, gad.a::new);
      this.a(kx.af, fzy.b::new);
      this.a(kx.ai, fzz.c::new);
      this.a(kx.aj, fzw.a::new);
      this.a(kx.ak, fzu.d::new);
      this.a(kx.as, fyf::f);
      this.a(kx.at, fyf::g);
      this.a(kx.au, fyf::h);
      this.a(kx.av, fyf::m);
      this.a(kx.aw, fyf::n);
      this.a(kx.aA, fzz.b::new);
      this.a(kx.ax, fxt.a::new);
      this.a(kx.ay, fzz.a::new);
      this.a(kx.az, fzz.d::new);
      this.a(kx.aB, fyf::o);
      this.a(kx.aC, fyf::p);
      this.a(kx.aD, fyf::q);
      this.a(kx.aE, fzj.a::new);
      this.a(kx.aF, gak.a::new);
      this.a(kx.aG, fyo.b::new);
      this.a(kx.aK, fyf::i);
      this.a(kx.aL, fyf::j);
      this.a(kx.F, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new fyc($$2, $$3, $$4, $$5, $$0));
      this.a(kx.aI, fyf::k);
      this.a(kx.aJ, fyf::l);
      this.a(kx.R, gag.a::new);
      this.a(kx.aM, fzy.a::new);
      this.a(kx.aN, fyq.b::new);
      this.a(kx.aO, fyq.e::new);
      this.a(kx.aP, fyq.d::new);
      this.a(kx.aQ, fyq.a::new);
      this.a(kx.aR, fyq.c::new);
      this.a(kx.aS, fzn.a::new);
      this.a(kx.aT, gaa.c::new);
      this.a(kx.aU, fyj.a::new);
      this.a(kx.aV, gaf.a::new);
      this.a(kx.aW, fyp.c::new);
   }

   private <T extends kv> void a(kw<T> $$0, fzf<T> $$1) {
      this.k.put(ld.j.a($$0), $$1);
   }

   private <T extends kv> void a(kw<T> $$0, fzf.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            gac $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends kv> void a(kw<T> $$0, fze.c<T> $$1) {
      fze.b $$2 = new fze.b();
      this.m.put(ld.j.b($$0), $$2);
      this.k.put(ld.j.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(atl.a $$0, atr $$1, bma $$2, bma $$3, Executor $$4, Executor $$5) {
      record a(akh a, Optional<List<akh>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<akh, atp>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            akh $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ac.d($$2x);
      });
      CompletableFuture<gmt.a> $$7 = gmt.a(this.n).a($$1, d, 0, $$4).thenCompose(gmt.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         gmt.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<akh> $$5x = new HashSet<>();
         gmy $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<akh>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<gmy> $$5xx = new ArrayList<>();

               for (akh $$6xx : $$4xx.get()) {
                  gmy $$7x = $$4x.f().get($$6xx);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(akh::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<akh>> a(akh $$0, atp $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               fzd $$3 = fzd.a(axp.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(brh $$0, kv $$1) {
      this.h.add(new gae(this.a, $$0, $$1));
   }

   public void a(brh $$0, kv $$1, int $$2) {
      this.h.add(new gae(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public fzc a(kv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      fzc $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends kv> fzc b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      fzf<T> $$7 = (fzf<T>)this.k.get(ld.j.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fzc $$0) {
      Optional<ku> $$1 = $$0.o();
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
         this.a.af().a($$0.toString());
         this.a($$1x);
         this.a.af().c();
      });
      if (!this.h.isEmpty()) {
         List<gae> $$0 = Lists.newArrayList();

         for (gae $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      fzc $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<fzc> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<fzc> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            fzc $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(ku $$0, int $$1) {
      this.o.addTo($$0, $$1);
   }

   private void b(fzc $$0) {
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

   public void a(gbn $$0, fcp $$1, float $$2) {
      $$0.c();
      RenderSystem.enableDepthTest();

      for (fzg $$3 : f) {
         Iterable<fzc> $$4 = this.g.get($$3);
         if ($$4 != null) {
            RenderSystem.setShader(gbh::u);
            exz $$5 = exz.b();
            exs $$6 = $$5.d();
            $$3.a($$6, this.i);

            for (fzc $$7 : $$4) {
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

   public void a(@Nullable fvw $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(in $$0, dqh $$1) {
      if (!$$1.i() && $$1.z()) {
         eui $$2 = $$1.j(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, axz.c($$8 / 0.25));
               int $$12 = Math.max(2, axz.c($$9 / 0.25));
               int $$13 = Math.max(2, axz.c($$10 / 0.25));

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
                           new gab(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(in $$0, is $$1) {
      dqh $$2 = this.a.a_($$0);
      if ($$2.l() != djk.a && $$2.z()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         etk $$7 = $$2.j(this.a, $$0).a();
         double $$8 = (double)$$3 + this.j.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.j.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.j.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == is.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == is.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == is.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == is.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == is.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == is.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new gab(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(ku $$0) {
      return this.o.getInt($$0) < $$0.a();
   }

   private void f() {
      this.g.clear();
      this.l.clear();
      this.h.clear();
      this.o.clear();
   }

   static class b implements fzx {
      private List<gmy> a;

      @Override
      public gmy a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public gmy a(ayg $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<gmy> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends kv> {
      fzf<T> create(fzx var1);
   }
}
