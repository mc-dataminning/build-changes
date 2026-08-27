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

public class fvi implements asi {
   private static final Logger b = LogUtils.getLogger();
   private static final aja c = aja.a("particles");
   private static final ajh d = new ajh("particles");
   private static final int e = 16384;
   private static final List<fvk> f = ImmutableList.of(fvk.a, fvk.b, fvk.d, fvk.c, fvk.e);
   protected fsa a;
   private final Map<fvk, Queue<fvg>> g = Maps.newIdentityHashMap();
   private final Queue<fwi> h = Queues.newArrayDeque();
   private final gjd i;
   private final axd j = axd.a();
   private final Int2ObjectMap<fvj<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<fvg> l = Queues.newArrayDeque();
   private final Map<ajh, fvi.b> m = Maps.newHashMap();
   private final gjb n;
   private final Object2IntOpenHashMap<jz> o = new Object2IntOpenHashMap();

   public fvi(fsa $$0, gjd $$1) {
      this.n = new gjb(gjb.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(kc.a, fvy.a::new);
      this.a(kc.b, fux.a::new);
      this.a(kc.d, new fua.a());
      this.a(kc.c, new fwf.a());
      this.a(kc.e, fud.a::new);
      this.a(kc.ao, fuc.a::new);
      this.a(kc.am, fue.a::new);
      this.a(kc.ar, fuf.a::new);
      this.a(kc.as, fuf.b::new);
      this.a(kc.f, fvl.a::new);
      this.a(kc.O, fwe.a::new);
      this.a(kc.g, fuh.c::new);
      this.a(kc.an, fwm.a::new);
      this.a(kc.h, fuh.a::new);
      this.a(kc.i, fui.a::new);
      this.a(kc.aq, fwe.b::new);
      this.a(kc.j, fuj::c);
      this.a(kc.k, fuj::d);
      this.a(kc.l, fuj::e);
      this.a(kc.m, fuj::a);
      this.a(kc.n, fuj::b);
      this.a(kc.o, ful.a::new);
      this.a(kc.p, fuk.a::new);
      this.a(kc.q, fvy.d::new);
      this.a(kc.r, new fvd.a());
      this.a(kc.s, fuh.b::new);
      this.a(kc.t, fut.a::new);
      this.a(kc.u, fuo.a::new);
      this.a(kc.v, fvy.c::new);
      this.a(kc.w, new fuz.a());
      this.a(kc.x, fuy.a::new);
      this.a(kc.B, fvw.a::new);
      this.a(kc.C, fuq.a::new);
      this.a(kc.y, fuv.a::new);
      this.a(kc.z, new fuw.a(3.0, 7, 0));
      this.a(kc.A, new fuw.a(1.0, 3, 2));
      this.a(kc.D, fur.d::new);
      this.a(kc.E, fwl.a::new);
      this.a(kc.F, fus.a::new);
      this.a(kc.H, fvx.a::new);
      this.a(kc.I, fvp.a::new);
      this.a(kc.J, fvq.a::new);
      this.a(kc.L, fvx.b::new);
      this.a(kc.K, fus.a::new);
      this.a(kc.M, fur.a::new);
      this.a(kc.N, fwe.d::new);
      this.a(kc.P, fux.b::new);
      this.a(kc.Q, fvy.b::new);
      this.a(kc.R, new fub.a());
      this.a(kc.T, new fub.b());
      this.a(kc.U, new fub.c());
      this.a(kc.V, fvb.a::new);
      this.a(kc.W, fvc.a::new);
      this.a(kc.X, fwe.e::new);
      this.a(kc.ap, fut.b::new);
      this.a(kc.Y, fvf.a::new);
      this.a(kc.Z, fup.a::new);
      this.a(kc.aa, fvm.a::new);
      this.a(kc.ab, fwn.a::new);
      this.a(kc.ac, fvu.a::new);
      this.a(kc.ad, fwp.a::new);
      this.a(kc.ae, fvl.b::new);
      this.a(kc.aI, fvv.a::new);
      this.a(kc.af, fvz.a::new);
      this.a(kc.ah, fty.a::new);
      this.a(kc.ai, fwh.a::new);
      this.a(kc.ag, fwc.b::new);
      this.a(kc.aj, fwd.c::new);
      this.a(kc.ak, fwa.a::new);
      this.a(kc.al, fvy.e::new);
      this.a(kc.at, fuj::f);
      this.a(kc.au, fuj::g);
      this.a(kc.av, fuj::h);
      this.a(kc.aw, fuj::m);
      this.a(kc.ax, fuj::n);
      this.a(kc.aB, fwd.b::new);
      this.a(kc.ay, ftx.a::new);
      this.a(kc.az, fwd.a::new);
      this.a(kc.aA, fwd.d::new);
      this.a(kc.aC, fuj::o);
      this.a(kc.aD, fuj::p);
      this.a(kc.aE, fuj::q);
      this.a(kc.aF, fvn.a::new);
      this.a(kc.aG, fwo.a::new);
      this.a(kc.aH, fus.b::new);
      this.a(kc.aL, fuj::i);
      this.a(kc.aM, fuj::j);
      this.a(kc.G, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new fug($$2, $$3, $$4, $$5, $$0));
      this.a(kc.aJ, fuj::k);
      this.a(kc.aK, fuj::l);
      this.a(kc.S, fwk.a::new);
      this.a(kc.aN, fwc.a::new);
      this.a(kc.aO, fuu.b::new);
      this.a(kc.aP, fuu.e::new);
      this.a(kc.aQ, fuu.d::new);
      this.a(kc.aR, fuu.a::new);
      this.a(kc.aS, fuu.c::new);
      this.a(kc.aT, fvr.a::new);
      this.a(kc.aU, fwe.c::new);
      this.a(kc.aV, fun.a::new);
      this.a(kc.aW, fwj.a::new);
      this.a(kc.aX, fut.c::new);
   }

   private <T extends ka> void a(kb<T> $$0, fvj<T> $$1) {
      this.k.put(ki.j.a($$0), $$1);
   }

   private <T extends ka> void a(kb<T> $$0, fvj.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            fwg $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends ka> void a(kb<T> $$0, fvi.c<T> $$1) {
      fvi.b $$2 = new fvi.b();
      this.m.put(ki.j.b($$0), $$2);
      this.k.put(ki.j.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(asi.a $$0, aso $$1, bjr $$2, bjr $$3, Executor $$4, Executor $$5) {
      record a(ajh a, Optional<List<ajh>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<ajh, asm>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            ajh $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ac.d($$2x);
      });
      CompletableFuture<gix.a> $$7 = gix.a(this.n).a($$1, d, 0, $$4).thenCompose(gix.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         gix.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<ajh> $$5x = new HashSet<>();
         gjc $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<ajh>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<gjc> $$5xx = new ArrayList<>();

               for (ajh $$6xx : $$4xx.get()) {
                  gjc $$7x = $$4x.f().get($$6xx);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(ajh::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<ajh>> a(ajh $$0, asm $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               fvh $$3 = fvh.a(awm.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(box $$0, ka $$1) {
      this.h.add(new fwi(this.a, $$0, $$1));
   }

   public void a(box $$0, ka $$1, int $$2) {
      this.h.add(new fwi(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public fvg a(ka $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      fvg $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends ka> fvg b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      fvj<T> $$7 = (fvj<T>)this.k.get(ki.j.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fvg $$0) {
      Optional<jz> $$1 = $$0.o();
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
         this.a.ae().a($$0.toString());
         this.a($$1x);
         this.a.ae().c();
      });
      if (!this.h.isEmpty()) {
         List<fwi> $$0 = Lists.newArrayList();

         for (fwi $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      fvg $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<fvg> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<fvg> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            fvg $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(jz $$0, int $$1) {
      this.o.addTo($$0, $$1);
   }

   private void b(fvg $$0) {
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

   public void a(fxr $$0, eyt $$1, float $$2) {
      $$0.c();
      RenderSystem.enableDepthTest();

      for (fvk $$3 : f) {
         Iterable<fvg> $$4 = this.g.get($$3);
         if ($$4 != null) {
            RenderSystem.setShader(fxl::u);
            eud $$5 = eud.b();
            etw $$6 = $$5.d();
            $$3.a($$6, this.i);

            for (fvg $$7 : $$4) {
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

   public void a(@Nullable fsa $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(ib $$0, dnb $$1) {
      if (!$$1.i() && $$1.z()) {
         eqm $$2 = $$1.j(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, aww.c($$8 / 0.25));
               int $$12 = Math.max(2, aww.c($$9 / 0.25));
               int $$13 = Math.max(2, aww.c($$10 / 0.25));

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
                           new fwf(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(ib $$0, ih $$1) {
      dnb $$2 = this.a.a_($$0);
      if ($$2.l() != dgh.a && $$2.z()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         epo $$7 = $$2.j(this.a, $$0).a();
         double $$8 = (double)$$3 + this.j.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.j.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.j.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == ih.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == ih.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == ih.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == ih.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == ih.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == ih.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new fwf(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(jz $$0) {
      return this.o.getInt($$0) < $$0.a();
   }

   private void f() {
      this.g.clear();
      this.l.clear();
      this.h.clear();
      this.o.clear();
   }

   static class b implements fwb {
      private List<gjc> a;

      @Override
      public gjc a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public gjc a(axd $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<gjc> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends ka> {
      fvj<T> create(fwb var1);
   }
}
