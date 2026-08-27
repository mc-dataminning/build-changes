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

public class fxp implements asw {
   private static final Logger b = LogUtils.getLogger();
   private static final ajm c = ajm.a("particles");
   private static final ajt d = new ajt("particles");
   private static final int e = 16384;
   private static final List<fxr> f = ImmutableList.of(fxr.a, fxr.b, fxr.d, fxr.c, fxr.e);
   protected fuh a;
   private final Map<fxr, Queue<fxn>> g = Maps.newIdentityHashMap();
   private final Queue<fyp> h = Queues.newArrayDeque();
   private final glk i;
   private final axr j = axr.a();
   private final Int2ObjectMap<fxq<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<fxn> l = Queues.newArrayDeque();
   private final Map<ajt, fxp.b> m = Maps.newHashMap();
   private final gli n;
   private final Object2IntOpenHashMap<ki> o = new Object2IntOpenHashMap();

   public fxp(fuh $$0, glk $$1) {
      this.n = new gli(gli.f);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(kl.a, fyf.a::new);
      this.a(kl.b, fxe.a::new);
      this.a(kl.d, new fwh.a());
      this.a(kl.c, new fym.a());
      this.a(kl.e, fwk.a::new);
      this.a(kl.ao, fwj.a::new);
      this.a(kl.am, fwl.a::new);
      this.a(kl.ar, fwm.a::new);
      this.a(kl.as, fwm.b::new);
      this.a(kl.f, fxs.a::new);
      this.a(kl.O, fyl.a::new);
      this.a(kl.g, fwo.c::new);
      this.a(kl.an, fyt.a::new);
      this.a(kl.h, fwo.a::new);
      this.a(kl.i, fwp.a::new);
      this.a(kl.aq, fyl.b::new);
      this.a(kl.j, fwq::c);
      this.a(kl.k, fwq::d);
      this.a(kl.l, fwq::e);
      this.a(kl.m, fwq::a);
      this.a(kl.n, fwq::b);
      this.a(kl.o, fws.a::new);
      this.a(kl.p, fwr.a::new);
      this.a(kl.q, fyf.d::new);
      this.a(kl.r, new fxk.a());
      this.a(kl.s, fwo.b::new);
      this.a(kl.t, fxa.a::new);
      this.a(kl.u, fwv.a::new);
      this.a(kl.v, fyf.c::new);
      this.a(kl.w, new fxg.a());
      this.a(kl.x, fxf.a::new);
      this.a(kl.B, fyd.a::new);
      this.a(kl.C, fwx.a::new);
      this.a(kl.y, fxc.a::new);
      this.a(kl.z, new fxd.a(3.0, 7, 0));
      this.a(kl.A, new fxd.a(1.0, 3, 2));
      this.a(kl.D, fwy.d::new);
      this.a(kl.E, fys.a::new);
      this.a(kl.F, fwz.a::new);
      this.a(kl.H, fye.a::new);
      this.a(kl.I, fxw.a::new);
      this.a(kl.J, fxx.a::new);
      this.a(kl.L, fye.b::new);
      this.a(kl.K, fwz.a::new);
      this.a(kl.M, fwy.a::new);
      this.a(kl.N, fyl.d::new);
      this.a(kl.P, fxe.b::new);
      this.a(kl.Q, fyf.b::new);
      this.a(kl.R, new fwi.a());
      this.a(kl.T, new fwi.b());
      this.a(kl.U, new fwi.c());
      this.a(kl.V, fxi.a::new);
      this.a(kl.W, fxj.a::new);
      this.a(kl.X, fyl.e::new);
      this.a(kl.ap, fxa.b::new);
      this.a(kl.Y, fxm.a::new);
      this.a(kl.Z, fww.a::new);
      this.a(kl.aa, fxt.a::new);
      this.a(kl.ab, fyu.a::new);
      this.a(kl.ac, fyb.a::new);
      this.a(kl.ad, fyw.a::new);
      this.a(kl.ae, fxs.b::new);
      this.a(kl.aI, fyc.a::new);
      this.a(kl.af, fyg.a::new);
      this.a(kl.ah, fwf.a::new);
      this.a(kl.ai, fyo.a::new);
      this.a(kl.ag, fyj.b::new);
      this.a(kl.aj, fyk.c::new);
      this.a(kl.ak, fyh.a::new);
      this.a(kl.al, fyf.e::new);
      this.a(kl.at, fwq::f);
      this.a(kl.au, fwq::g);
      this.a(kl.av, fwq::h);
      this.a(kl.aw, fwq::m);
      this.a(kl.ax, fwq::n);
      this.a(kl.aB, fyk.b::new);
      this.a(kl.ay, fwe.a::new);
      this.a(kl.az, fyk.a::new);
      this.a(kl.aA, fyk.d::new);
      this.a(kl.aC, fwq::o);
      this.a(kl.aD, fwq::p);
      this.a(kl.aE, fwq::q);
      this.a(kl.aF, fxu.a::new);
      this.a(kl.aG, fyv.a::new);
      this.a(kl.aH, fwz.b::new);
      this.a(kl.aL, fwq::i);
      this.a(kl.aM, fwq::j);
      this.a(kl.G, $$0 -> ($$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8) -> new fwn($$2, $$3, $$4, $$5, $$0));
      this.a(kl.aJ, fwq::k);
      this.a(kl.aK, fwq::l);
      this.a(kl.S, fyr.a::new);
      this.a(kl.aN, fyj.a::new);
      this.a(kl.aO, fxb.b::new);
      this.a(kl.aP, fxb.e::new);
      this.a(kl.aQ, fxb.d::new);
      this.a(kl.aR, fxb.a::new);
      this.a(kl.aS, fxb.c::new);
      this.a(kl.aT, fxy.a::new);
      this.a(kl.aU, fyl.c::new);
      this.a(kl.aV, fwu.a::new);
      this.a(kl.aW, fyq.a::new);
      this.a(kl.aX, fxa.c::new);
   }

   private <T extends kj> void a(kk<T> $$0, fxq<T> $$1) {
      this.k.put(kr.j.a($$0), $$1);
   }

   private <T extends kj> void a(kk<T> $$0, fxq.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            fyn $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends kj> void a(kk<T> $$0, fxp.c<T> $$1) {
      fxp.b $$2 = new fxp.b();
      this.m.put(kr.j.b($$0), $$2);
      this.k.put(kr.j.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(asw.a $$0, atc $$1, bko $$2, bko $$3, Executor $$4, Executor $$5) {
      record a(ajt a, Optional<List<ajt>> b) {
      }

      CompletableFuture<List<a>> $$6 = CompletableFuture.<Map<ajt, ata>>supplyAsync(() -> c.a($$1), $$4).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            ajt $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$4));
         });
         return ac.d($$2x);
      });
      CompletableFuture<gle.a> $$7 = gle.a(this.n).a($$1, d, 0, $$4).thenCompose(gle.a::a);
      return CompletableFuture.allOf($$7, $$6).thenCompose($$0::a).thenAcceptAsync($$3x -> {
         this.f();
         $$3.a();
         $$3.a("upload");
         gle.a $$4x = $$7.join();
         this.n.a($$4x);
         $$3.b("bindSpriteSets");
         Set<ajt> $$5x = new HashSet<>();
         glj $$6x = $$4x.e();
         $$6.join().forEach($$3xx -> {
            Optional<List<ajt>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<glj> $$5xx = new ArrayList<>();

               for (ajt $$6xx : $$4xx.get()) {
                  glj $$7x = $$4x.f().get($$6xx);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(ajt::toString).collect(Collectors.joining(",")));
         }

         $$3.c();
         $$3.b();
      }, $$5);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<ajt>> a(ajt $$0, ata $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               fxo $$3 = fxo.a(axa.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bpv $$0, kj $$1) {
      this.h.add(new fyp(this.a, $$0, $$1));
   }

   public void a(bpv $$0, kj $$1, int $$2) {
      this.h.add(new fyp(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public fxn a(kj $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      fxn $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends kj> fxn b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      fxq<T> $$7 = (fxq<T>)this.k.get(kr.j.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(fxn $$0) {
      Optional<ki> $$1 = $$0.o();
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
         List<fyp> $$0 = Lists.newArrayList();

         for (fyp $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      fxn $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<fxn> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<fxn> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            fxn $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(ki $$0, int $$1) {
      this.o.addTo($$0, $$1);
   }

   private void b(fxn $$0) {
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

   public void a(fzy $$0, fba $$1, float $$2) {
      $$0.c();
      RenderSystem.enableDepthTest();

      for (fxr $$3 : f) {
         Iterable<fxn> $$4 = this.g.get($$3);
         if ($$4 != null) {
            RenderSystem.setShader(fzs::v);
            ewk $$5 = ewk.b();
            ewd $$6 = $$5.d();
            $$3.a($$6, this.i);

            for (fxn $$7 : $$4) {
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

   public void a(@Nullable fuh $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(ib $$0, doz $$1) {
      if (!$$1.i() && $$1.z()) {
         est $$2 = $$1.j(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, axk.c($$8 / 0.25));
               int $$12 = Math.max(2, axk.c($$9 / 0.25));
               int $$13 = Math.max(2, axk.c($$10 / 0.25));

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
                           new fym(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(ib $$0, ih $$1) {
      doz $$2 = this.a.a_($$0);
      if ($$2.l() != did.a && $$2.z()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         erv $$7 = $$2.j(this.a, $$0).a();
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

         this.a(new fym(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(ki $$0) {
      return this.o.getInt($$0) < $$0.a();
   }

   private void f() {
      this.g.clear();
      this.l.clear();
      this.h.clear();
      this.o.clear();
   }

   static class b implements fyi {
      private List<glj> a;

      @Override
      public glj a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public glj a(axr $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<glj> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends kj> {
      fxq<T> create(fyi var1);
   }
}
