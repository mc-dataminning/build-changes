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

public class fvg implements asi {
   private static final Logger b = LogUtils.getLogger();
   private static final aja c = aja.a("particles");
   private static final ajh d = new ajh("particles");
   private static final int e = 16384;
   private static final List<fvi> f = ImmutableList.of(fvi.a, fvi.b, fvi.d, fvi.c, fvi.e);
   protected fry a;
   private final Map<fvi, Queue<fve>> g = Maps.newIdentityHashMap();
   private final Queue<fwg> h = Queues.newArrayDeque();
   private final gja i;
   private final axd j = axd.a();
   private final Int2ObjectMap<fvh<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<fve> l = Queues.newArrayDeque();
   private final Map<ajh, fvg.b> m = Maps.newHashMap();
   private final giy n;
   private final Object2IntOpenHashMap<jz> o = new Object2IntOpenHashMap();

   public fvg(fry $$0, gja $$1) {
      this.n = new giy(giy.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(kc.a, fvw.a::new);
      this.a(kc.b, fuv.a::new);
      this.a(kc.d, new fty.a());
      this.a(kc.c, new fwd.a());
      this.a(kc.e, fub.a::new);
      this.a(kc.ao, fua.a::new);
      this.a(kc.am, fuc.a::new);
      this.a(kc.ar, fud.a::new);
      this.a(kc.as, fud.b::new);
      this.a(kc.f, fvj.a::new);
      this.a(kc.O, fwc.a::new);
      this.a(kc.g, fuf.c::new);
      this.a(kc.an, fwk.a::new);
      this.a(kc.h, fuf.a::new);
      this.a(kc.i, fug.a::new);
      this.a(kc.aq, fwc.b::new);
      this.a(kc.j, fuh::c);
      this.a(kc.k, fuh::d);
      this.a(kc.l, fuh::e);
      this.a(kc.m, fuh::a);
      this.a(kc.n, fuh::b);
      this.a(kc.o, fuj.a::new);
      this.a(kc.p, fui.a::new);
      this.a(kc.q, fvw.d::new);
      this.a(kc.r, new fvb.a());
      this.a(kc.s, fuf.b::new);
      this.a(kc.t, fur.a::new);
      this.a(kc.u, fum.a::new);
      this.a(kc.v, fvw.c::new);
      this.a(kc.w, new fux.a());
      this.a(kc.x, fuw.a::new);
      this.a(kc.B, fvu.a::new);
      this.a(kc.C, fuo.a::new);
      this.a(kc.y, fut.a::new);
      this.a(kc.z, new fuu.a(3.0, 7, 0));
      this.a(kc.A, new fuu.a(1.0, 3, 2));
      this.a(kc.D, fup.d::new);
      this.a(kc.E, fwj.a::new);
      this.a(kc.F, fuq.a::new);
      this.a(kc.H, fvv.a::new);
      this.a(kc.I, fvn.a::new);
      this.a(kc.J, fvo.a::new);
      this.a(kc.L, fvv.b::new);
      this.a(kc.K, fuq.a::new);
      this.a(kc.M, fup.a::new);
      this.a(kc.N, fwc.d::new);
      this.a(kc.P, fuv.b::new);
      this.a(kc.Q, fvw.b::new);
      this.a(kc.R, new ftz.a());
      this.a(kc.T, new ftz.b());
      this.a(kc.U, new ftz.c());
      this.a(kc.V, fuz.a::new);
      this.a(kc.W, fva.a::new);
      this.a(kc.X, fwc.e::new);
      this.a(kc.ap, fur.b::new);
      this.a(kc.Y, fvd.a::new);
      this.a(kc.Z, fun.a::new);
      this.a(kc.aa, fvk.a::new);
      this.a(kc.ab, fwl.a::new);
      this.a(kc.ac, fvs.a::new);
      this.a(kc.ad, fwn.a::new);
      this.a(kc.ae, fvj.b::new);
      this.a(kc.aI, fvt.a::new);
      this.a(kc.af, fvx.a::new);
      this.a(kc.ah, ftw.a::new);
      this.a(kc.ai, fwf.a::new);
      this.a(kc.ag, fwa.b::new);
      this.a(kc.aj, fwb.c::new);
      this.a(kc.ak, fvy.a::new);
      this.a(kc.al, fvw.e::new);
      this.a(kc.at, fuh::f);
      this.a(kc.au, fuh::g);
      this.a(kc.av, fuh::h);
      this.a(kc.aw, fuh::m);
      this.a(kc.ax, fuh::n);
      this.a(kc.aB, fwb.b::new);
      this.a(kc.ay, ftv.a::new);
      this.a(kc.az, fwb.a::new);
      this.a(kc.aA, fwb.d::new);
      this.a(kc.aC, fuh::o);
      this.a(kc.aD, fuh::p);
      this.a(kc.aE, fuh::q);
      this.a(kc.aF, fvl.a::new);
      this.a(kc.aG, fwm.a::new);
      this.a(kc.aH, fuq.b::new);
      this.a(kc.aL, fuh::i);
      this.a(kc.aM, fuh::j);
      this.a(kc.G, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new fue($$2, $$3, $$4, $$5, $$0));
      this.a(kc.aJ, fuh::k);
      this.a(kc.aK, fuh::l);
      this.a(kc.S, fwi.a::new);
      this.a(kc.aN, fwa.a::new);
      this.a(kc.aO, fus.b::new);
      this.a(kc.aP, fus.e::new);
      this.a(kc.aQ, fus.d::new);
      this.a(kc.aR, fus.a::new);
      this.a(kc.aS, fus.c::new);
      this.a(kc.aT, fvp.a::new);
      this.a(kc.aU, fwc.c::new);
      this.a(kc.aV, ful.a::new);
      this.a(kc.aW, fwh.a::new);
      this.a(kc.aX, fur.c::new);
   }

   private <T extends ka> void a(kb<T> $$0, fvh<T> $$1) {
      this.k.put(ki.j.a($$0), $$1);
   }

   private <T extends ka> void a(kb<T> $$0, fvh.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            fwe $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends ka> void a(kb<T> $$0, fvg.c<T> $$1) {
      fvg.b $$2 = new fvg.b();
      this.m.put(ki.j.b($$0), $$2);
      this.k.put(ki.j.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(asi.a $$0, aso $$1, bjq $$2, bjq $$3, Executor $$4, Executor $$5) {
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
      CompletableFuture<giu.a> $$7 = giu.a(this.n).a($$1, d, 0, $$4).thenCompose(giu.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         giu.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<ajh> $$5x = new HashSet<>();
         giz $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<ajh>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<giz> $$5xx = new ArrayList<>();

               for (ajh $$6xx : $$4xx.get()) {
                  giz $$7x = $$4x.f().get($$6xx);
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
               fvf $$3 = fvf.a(awm.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bow $$0, ka $$1) {
      this.h.add(new fwg(this.a, $$0, $$1));
   }

   public void a(bow $$0, ka $$1, int $$2) {
      this.h.add(new fwg(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public fve a(ka $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      fve $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends ka> fve b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      fvh<T> $$7 = (fvh<T>)this.k.get(ki.j.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fve $$0) {
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
         List<fwg> $$0 = Lists.newArrayList();

         for (fwg $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      fve $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<fve> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<fve> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            fve $$2 = $$1.next();
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

   private void b(fve $$0) {
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

   public void a(fxp $$0, eyr $$1, float $$2) {
      $$0.c();
      RenderSystem.enableDepthTest();

      for (fvi $$3 : f) {
         Iterable<fve> $$4 = this.g.get($$3);
         if ($$4 != null) {
            RenderSystem.setShader(fxj::u);
            eub $$5 = eub.b();
            etu $$6 = $$5.d();
            $$3.a($$6, this.i);

            for (fve $$7 : $$4) {
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

   public void a(@Nullable fry $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(ib $$0, dmz $$1) {
      if (!$$1.i() && $$1.z()) {
         eqk $$2 = $$1.j(this.a, $$0);
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
                           new fwd(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(ib $$0, ih $$1) {
      dmz $$2 = this.a.a_($$0);
      if ($$2.l() != dgf.a && $$2.z()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         epm $$7 = $$2.j(this.a, $$0).a();
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

         this.a(new fwd(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
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

   static class b implements fvz {
      private List<giz> a;

      @Override
      public giz a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public giz a(axd $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<giz> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends ka> {
      fvh<T> create(fvz var1);
   }
}
