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

public class fxy implements asy {
   private static final Logger b = LogUtils.getLogger();
   private static final ajo c = ajo.a("particles");
   private static final ajv d = new ajv("particles");
   private static final int e = 16384;
   private static final List<fya> f = ImmutableList.of(fya.a, fya.b, fya.d, fya.c, fya.e);
   protected fuq a;
   private final Map<fya, Queue<fxw>> g = Maps.newIdentityHashMap();
   private final Queue<fyy> h = Queues.newArrayDeque();
   private final glt i;
   private final axt j = axt.a();
   private final Int2ObjectMap<fxz<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<fxw> l = Queues.newArrayDeque();
   private final Map<ajv, fxy.b> m = Maps.newHashMap();
   private final glr n;
   private final Object2IntOpenHashMap<kk> o = new Object2IntOpenHashMap();

   public fxy(fuq $$0, glt $$1) {
      this.n = new glr(glr.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(kn.a, fyo.a::new);
      this.a(kn.b, fxn.a::new);
      this.a(kn.d, new fwq.a());
      this.a(kn.c, new fyv.a());
      this.a(kn.e, fwt.a::new);
      this.a(kn.ao, fws.a::new);
      this.a(kn.am, fwu.a::new);
      this.a(kn.ar, fwv.a::new);
      this.a(kn.as, fwv.b::new);
      this.a(kn.f, fyb.a::new);
      this.a(kn.O, fyu.a::new);
      this.a(kn.g, fwx.c::new);
      this.a(kn.an, fzc.a::new);
      this.a(kn.h, fwx.a::new);
      this.a(kn.i, fwy.a::new);
      this.a(kn.aq, fyu.b::new);
      this.a(kn.j, fwz::c);
      this.a(kn.k, fwz::d);
      this.a(kn.l, fwz::e);
      this.a(kn.m, fwz::a);
      this.a(kn.n, fwz::b);
      this.a(kn.o, fxb.a::new);
      this.a(kn.p, fxa.a::new);
      this.a(kn.q, fyo.d::new);
      this.a(kn.r, new fxt.a());
      this.a(kn.s, fwx.b::new);
      this.a(kn.t, fxj.a::new);
      this.a(kn.u, fxe.a::new);
      this.a(kn.v, fyo.c::new);
      this.a(kn.w, new fxp.a());
      this.a(kn.x, fxo.a::new);
      this.a(kn.B, fym.a::new);
      this.a(kn.C, fxg.a::new);
      this.a(kn.y, fxl.a::new);
      this.a(kn.z, new fxm.a(3.0, 7, 0));
      this.a(kn.A, new fxm.a(1.0, 3, 2));
      this.a(kn.D, fxh.d::new);
      this.a(kn.E, fzb.a::new);
      this.a(kn.F, fxi.a::new);
      this.a(kn.H, fyn.a::new);
      this.a(kn.I, fyf.a::new);
      this.a(kn.J, fyg.a::new);
      this.a(kn.L, fyn.b::new);
      this.a(kn.K, fxi.a::new);
      this.a(kn.M, fxh.a::new);
      this.a(kn.N, fyu.d::new);
      this.a(kn.P, fxn.b::new);
      this.a(kn.Q, fyo.b::new);
      this.a(kn.R, new fwr.a());
      this.a(kn.T, new fwr.b());
      this.a(kn.U, new fwr.c());
      this.a(kn.V, fxr.a::new);
      this.a(kn.W, fxs.a::new);
      this.a(kn.X, fyu.e::new);
      this.a(kn.ap, fxj.b::new);
      this.a(kn.Y, fxv.a::new);
      this.a(kn.Z, fxf.a::new);
      this.a(kn.aa, fyc.a::new);
      this.a(kn.ab, fzd.a::new);
      this.a(kn.ac, fyk.a::new);
      this.a(kn.ad, fzf.a::new);
      this.a(kn.ae, fyb.b::new);
      this.a(kn.aI, fyl.a::new);
      this.a(kn.af, fyp.a::new);
      this.a(kn.ah, fwo.a::new);
      this.a(kn.ai, fyx.a::new);
      this.a(kn.ag, fys.b::new);
      this.a(kn.aj, fyt.c::new);
      this.a(kn.ak, fyq.a::new);
      this.a(kn.al, fyo.e::new);
      this.a(kn.at, fwz::f);
      this.a(kn.au, fwz::g);
      this.a(kn.av, fwz::h);
      this.a(kn.aw, fwz::m);
      this.a(kn.ax, fwz::n);
      this.a(kn.aB, fyt.b::new);
      this.a(kn.ay, fwn.a::new);
      this.a(kn.az, fyt.a::new);
      this.a(kn.aA, fyt.d::new);
      this.a(kn.aC, fwz::o);
      this.a(kn.aD, fwz::p);
      this.a(kn.aE, fwz::q);
      this.a(kn.aF, fyd.a::new);
      this.a(kn.aG, fze.a::new);
      this.a(kn.aH, fxi.b::new);
      this.a(kn.aL, fwz::i);
      this.a(kn.aM, fwz::j);
      this.a(kn.G, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new fww($$2, $$3, $$4, $$5, $$0));
      this.a(kn.aJ, fwz::k);
      this.a(kn.aK, fwz::l);
      this.a(kn.S, fza.a::new);
      this.a(kn.aN, fys.a::new);
      this.a(kn.aO, fxk.b::new);
      this.a(kn.aP, fxk.e::new);
      this.a(kn.aQ, fxk.d::new);
      this.a(kn.aR, fxk.a::new);
      this.a(kn.aS, fxk.c::new);
      this.a(kn.aT, fyh.a::new);
      this.a(kn.aU, fyu.c::new);
      this.a(kn.aV, fxd.a::new);
      this.a(kn.aW, fyz.a::new);
      this.a(kn.aX, fxj.c::new);
   }

   private <T extends kl> void a(km<T> $$0, fxz<T> $$1) {
      this.k.put(kt.j.a($$0), $$1);
   }

   private <T extends kl> void a(km<T> $$0, fxz.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            fyw $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends kl> void a(km<T> $$0, fxy.c<T> $$1) {
      fxy.b $$2 = new fxy.b();
      this.m.put(kt.j.b($$0), $$2);
      this.k.put(kt.j.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(asy.a $$0, ate $$1, bkt $$2, bkt $$3, Executor $$4, Executor $$5) {
      record a(ajv a, Optional<List<ajv>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<ajv, atc>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            ajv $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ac.d($$2x);
      });
      CompletableFuture<gln.a> $$7 = gln.a(this.n).a($$1, d, 0, $$4).thenCompose(gln.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         gln.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<ajv> $$5x = new HashSet<>();
         gls $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<ajv>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<gls> $$5xx = new ArrayList<>();

               for (ajv $$6xx : $$4xx.get()) {
                  gls $$7x = $$4x.f().get($$6xx);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(ajv::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<ajv>> a(ajv $$0, atc $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               fxx $$3 = fxx.a(axc.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bqa $$0, kl $$1) {
      this.h.add(new fyy(this.a, $$0, $$1));
   }

   public void a(bqa $$0, kl $$1, int $$2) {
      this.h.add(new fyy(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public fxw a(kl $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      fxw $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends kl> fxw b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      fxz<T> $$7 = (fxz<T>)this.k.get(kt.j.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fxw $$0) {
      Optional<kk> $$1 = $$0.o();
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
         List<fyy> $$0 = Lists.newArrayList();

         for (fyy $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      fxw $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<fxw> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<fxw> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            fxw $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(kk $$0, int $$1) {
      this.o.addTo($$0, $$1);
   }

   private void b(fxw $$0) {
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

   public void a(gah $$0, fbj $$1, float $$2) {
      $$0.c();
      RenderSystem.enableDepthTest();

      for (fya $$3 : f) {
         Iterable<fxw> $$4 = this.g.get($$3);
         if ($$4 != null) {
            RenderSystem.setShader(gab::v);
            ewt $$5 = ewt.b();
            ewm $$6 = $$5.d();
            $$3.a($$6, this.i);

            for (fxw $$7 : $$4) {
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

   public void a(@Nullable fuq $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(id $$0, dpi $$1) {
      if (!$$1.i() && $$1.z()) {
         etc $$2 = $$1.j(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, axm.c($$8 / 0.25));
               int $$12 = Math.max(2, axm.c($$9 / 0.25));
               int $$13 = Math.max(2, axm.c($$10 / 0.25));

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
                           new fyv(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(id $$0, ij $$1) {
      dpi $$2 = this.a.a_($$0);
      if ($$2.l() != dim.a && $$2.z()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         ese $$7 = $$2.j(this.a, $$0).a();
         double $$8 = (double)$$3 + this.j.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.j.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.j.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == ij.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == ij.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == ij.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == ij.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == ij.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == ij.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new fyv(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(kk $$0) {
      return this.o.getInt($$0) < $$0.a();
   }

   private void f() {
      this.g.clear();
      this.l.clear();
      this.h.clear();
      this.o.clear();
   }

   static class b implements fyr {
      private List<gls> a;

      @Override
      public gls a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public gls a(axt $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<gls> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends kl> {
      fxz<T> create(fyr var1);
   }
}
