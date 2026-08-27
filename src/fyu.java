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

public class fyu implements ati {
   private static final Logger b = LogUtils.getLogger();
   private static final ajy c = ajy.a("particles");
   private static final akf d = new akf("particles");
   private static final int e = 16384;
   private static final List<fyw> f = ImmutableList.of(fyw.a, fyw.b, fyw.d, fyw.c, fyw.e);
   protected fvm a;
   private final Map<fyw, Queue<fys>> g = Maps.newIdentityHashMap();
   private final Queue<fzu> h = Queues.newArrayDeque();
   private final gmp i;
   private final ayd j = ayd.a();
   private final Int2ObjectMap<fyv<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<fys> l = Queues.newArrayDeque();
   private final Map<akf, fyu.b> m = Maps.newHashMap();
   private final gmn n;
   private final Object2IntOpenHashMap<kt> o = new Object2IntOpenHashMap();

   public fyu(fvm $$0, gmp $$1) {
      this.n = new gmn(gmn.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(kw.a, fyj.a::new);
      this.a(kw.c, new fxm.a());
      this.a(kw.b, new fzr.a());
      this.a(kw.d, fxp.a::new);
      this.a(kw.an, fxo.a::new);
      this.a(kw.al, fxq.a::new);
      this.a(kw.aq, fxr.a::new);
      this.a(kw.ar, fxr.b::new);
      this.a(kw.e, fyx.a::new);
      this.a(kw.N, fzq.a::new);
      this.a(kw.f, fxt.c::new);
      this.a(kw.am, fzy.a::new);
      this.a(kw.g, fxt.a::new);
      this.a(kw.h, fxu.a::new);
      this.a(kw.ap, fzq.b::new);
      this.a(kw.i, fxv::c);
      this.a(kw.j, fxv::d);
      this.a(kw.k, fxv::e);
      this.a(kw.l, fxv::a);
      this.a(kw.m, fxv::b);
      this.a(kw.n, fxx.a::new);
      this.a(kw.o, fxw.a::new);
      this.a(kw.p, fzk.c::new);
      this.a(kw.q, new fyp.a());
      this.a(kw.r, fxt.b::new);
      this.a(kw.s, fyf.a::new);
      this.a(kw.t, fya.a::new);
      this.a(kw.u, fzk.b::new);
      this.a(kw.v, new fyl.a());
      this.a(kw.w, fyk.a::new);
      this.a(kw.A, fzi.a::new);
      this.a(kw.B, fyc.a::new);
      this.a(kw.x, fyh.a::new);
      this.a(kw.y, new fyi.a(3.0, 7, 0));
      this.a(kw.z, new fyi.a(1.0, 3, 2));
      this.a(kw.C, fyd.d::new);
      this.a(kw.D, fzx.a::new);
      this.a(kw.E, fye.a::new);
      this.a(kw.G, fzj.a::new);
      this.a(kw.H, fzb.a::new);
      this.a(kw.I, fzc.a::new);
      this.a(kw.K, fzj.b::new);
      this.a(kw.J, fye.a::new);
      this.a(kw.L, fyd.a::new);
      this.a(kw.M, fzq.d::new);
      this.a(kw.O, fyj.b::new);
      this.a(kw.P, fzk.a::new);
      this.a(kw.Q, new fxn.a());
      this.a(kw.S, new fxn.b());
      this.a(kw.T, new fxn.c());
      this.a(kw.U, fyn.a::new);
      this.a(kw.V, fyo.a::new);
      this.a(kw.W, fzq.e::new);
      this.a(kw.ao, fyf.b::new);
      this.a(kw.X, fyr.a::new);
      this.a(kw.Y, fyb.a::new);
      this.a(kw.Z, fyy.a::new);
      this.a(kw.aa, fzz.a::new);
      this.a(kw.ab, fzg.a::new);
      this.a(kw.ac, gab.a::new);
      this.a(kw.ad, fyx.b::new);
      this.a(kw.aH, fzh.a::new);
      this.a(kw.ae, fzl.a::new);
      this.a(kw.ag, fxk.a::new);
      this.a(kw.ah, fzt.a::new);
      this.a(kw.af, fzo.b::new);
      this.a(kw.ai, fzp.c::new);
      this.a(kw.aj, fzm.a::new);
      this.a(kw.ak, fzk.d::new);
      this.a(kw.as, fxv::f);
      this.a(kw.at, fxv::g);
      this.a(kw.au, fxv::h);
      this.a(kw.av, fxv::m);
      this.a(kw.aw, fxv::n);
      this.a(kw.aA, fzp.b::new);
      this.a(kw.ax, fxj.a::new);
      this.a(kw.ay, fzp.a::new);
      this.a(kw.az, fzp.d::new);
      this.a(kw.aB, fxv::o);
      this.a(kw.aC, fxv::p);
      this.a(kw.aD, fxv::q);
      this.a(kw.aE, fyz.a::new);
      this.a(kw.aF, gaa.a::new);
      this.a(kw.aG, fye.b::new);
      this.a(kw.aK, fxv::i);
      this.a(kw.aL, fxv::j);
      this.a(kw.F, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new fxs($$2, $$3, $$4, $$5, $$0));
      this.a(kw.aI, fxv::k);
      this.a(kw.aJ, fxv::l);
      this.a(kw.R, fzw.a::new);
      this.a(kw.aM, fzo.a::new);
      this.a(kw.aN, fyg.b::new);
      this.a(kw.aO, fyg.e::new);
      this.a(kw.aP, fyg.d::new);
      this.a(kw.aQ, fyg.a::new);
      this.a(kw.aR, fyg.c::new);
      this.a(kw.aS, fzd.a::new);
      this.a(kw.aT, fzq.c::new);
      this.a(kw.aU, fxz.a::new);
      this.a(kw.aV, fzv.a::new);
      this.a(kw.aW, fyf.c::new);
   }

   private <T extends ku> void a(kv<T> $$0, fyv<T> $$1) {
      this.k.put(lc.j.a($$0), $$1);
   }

   private <T extends ku> void a(kv<T> $$0, fyv.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            fzs $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends ku> void a(kv<T> $$0, fyu.c<T> $$1) {
      fyu.b $$2 = new fyu.b();
      this.m.put(lc.j.b($$0), $$2);
      this.k.put(lc.j.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(ati.a $$0, ato $$1, ble $$2, ble $$3, Executor $$4, Executor $$5) {
      record a(akf a, Optional<List<akf>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<akf, atm>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            akf $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ac.d($$2x);
      });
      CompletableFuture<gmj.a> $$7 = gmj.a(this.n).a($$1, d, 0, $$4).thenCompose(gmj.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         gmj.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<akf> $$5x = new HashSet<>();
         gmo $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<akf>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<gmo> $$5xx = new ArrayList<>();

               for (akf $$6xx : $$4xx.get()) {
                  gmo $$7x = $$4x.f().get($$6xx);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(akf::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<akf>> a(akf $$0, atm $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               fyt $$3 = fyt.a(axm.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bql $$0, ku $$1) {
      this.h.add(new fzu(this.a, $$0, $$1));
   }

   public void a(bql $$0, ku $$1, int $$2) {
      this.h.add(new fzu(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public fys a(ku $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      fys $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends ku> fys b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      fyv<T> $$7 = (fyv<T>)this.k.get(lc.j.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fys $$0) {
      Optional<kt> $$1 = $$0.o();
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
         List<fzu> $$0 = Lists.newArrayList();

         for (fzu $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      fys $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<fys> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<fys> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            fys $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(kt $$0, int $$1) {
      this.o.addTo($$0, $$1);
   }

   private void b(fys $$0) {
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

   public void a(gbd $$0, fcf $$1, float $$2) {
      $$0.c();
      RenderSystem.enableDepthTest();

      for (fyw $$3 : f) {
         Iterable<fys> $$4 = this.g.get($$3);
         if ($$4 != null) {
            RenderSystem.setShader(gax::u);
            exp $$5 = exp.b();
            exi $$6 = $$5.d();
            $$3.a($$6, this.i);

            for (fys $$7 : $$4) {
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

   public void a(@Nullable fvm $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(im $$0, dpy $$1) {
      if (!$$1.i() && $$1.z()) {
         ety $$2 = $$1.j(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, axw.c($$8 / 0.25));
               int $$12 = Math.max(2, axw.c($$9 / 0.25));
               int $$13 = Math.max(2, axw.c($$10 / 0.25));

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
                           new fzr(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(im $$0, ir $$1) {
      dpy $$2 = this.a.a_($$0);
      if ($$2.l() != djb.a && $$2.z()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         eta $$7 = $$2.j(this.a, $$0).a();
         double $$8 = (double)$$3 + this.j.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.j.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.j.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == ir.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == ir.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == ir.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == ir.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == ir.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == ir.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new fzr(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(kt $$0) {
      return this.o.getInt($$0) < $$0.a();
   }

   private void f() {
      this.g.clear();
      this.l.clear();
      this.h.clear();
      this.o.clear();
   }

   static class b implements fzn {
      private List<gmo> a;

      @Override
      public gmo a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public gmo a(ayd $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<gmo> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends ku> {
      fyv<T> create(fzn var1);
   }
}
