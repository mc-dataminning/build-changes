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

public class gjk implements auj {
   private static final Logger b = LogUtils.getLogger();
   private static final ako c = ako.a("particles");
   private static final akv d = akv.b("particles");
   private static final int e = 16384;
   private static final List<gjm> f = List.of(gjm.a, gjm.b, gjm.c);
   protected gga a;
   private final Map<gjm, Queue<gji>> g = Maps.newIdentityHashMap();
   private final Queue<gkk> h = Queues.newArrayDeque();
   private final hev i;
   private final azh j = azh.a();
   private final Int2ObjectMap<gjl<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<gji> l = Queues.newArrayDeque();
   private final Map<akv, gjk.b> m = Maps.newHashMap();
   private final hes n;
   private final Object2IntOpenHashMap<lq> o = new Object2IntOpenHashMap();

   public gjk(gga $$0, hev $$1) {
      this.n = new hes(hes.e);
      $$1.a(this.n.g(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(lt.a, giz.a::new);
      this.a(lt.c, new gib.a());
      this.a(lt.b, new gkh.c());
      this.a(lt.d, gie.a::new);
      this.a(lt.as, gid.a::new);
      this.a(lt.aq, gif.a::new);
      this.a(lt.av, gig.a::new);
      this.a(lt.aw, gig.b::new);
      this.a(lt.e, gjn.a::new);
      this.a(lt.Q, gkg.a::new);
      this.a(lt.f, gih.c::new);
      this.a(lt.ar, gkp.a::new);
      this.a(lt.g, gih.a::new);
      this.a(lt.h, gii.a::new);
      this.a(lt.au, gkg.b::new);
      this.a(lt.i, gij::c);
      this.a(lt.j, gij::d);
      this.a(lt.k, gij::e);
      this.a(lt.l, gij::a);
      this.a(lt.m, gij::b);
      this.a(lt.n, gil.a::new);
      this.a(lt.o, gik.a::new);
      this.a(lt.p, gka.c::new);
      this.a(lt.q, new gjf.a());
      this.a(lt.r, gih.b::new);
      this.a(lt.s, giv.a::new);
      this.a(lt.t, gio.a::new);
      this.a(lt.u, gka.b::new);
      this.a(lt.v, new gjb.a());
      this.a(lt.w, gja.a::new);
      this.a(lt.B, gjy.a::new);
      this.a(lt.C, giq.a::new);
      this.a(lt.x, gix.a::new);
      this.a(lt.y, gix.b::new);
      this.a(lt.z, new giy.a(3.0, 7, 0));
      this.a(lt.A, new giy.a(1.0, 3, 2));
      this.a(lt.D, gis.d::new);
      this.a(lt.E, gko.a::new);
      this.a(lt.F, git.a::new);
      this.a(lt.G, gka.c::new);
      this.a(lt.J, gjz.a::new);
      this.a(lt.K, gjr.a::new);
      this.a(lt.L, gjs.a::new);
      this.a(lt.N, gjz.b::new);
      this.a(lt.M, git.a::new);
      this.a(lt.O, gis.a::new);
      this.a(lt.P, gkg.d::new);
      this.a(lt.R, giz.b::new);
      this.a(lt.S, gka.a::new);
      this.a(lt.T, new gic.c());
      this.a(lt.W, new gic.d());
      this.a(lt.X, new gic.a());
      this.a(lt.Y, new gic.e());
      this.a(lt.Z, gjd.a::new);
      this.a(lt.aa, gje.a::new);
      this.a(lt.ab, gkg.e::new);
      this.a(lt.at, giv.b::new);
      this.a(lt.ac, gjh.a::new);
      this.a(lt.ad, gip.a::new);
      this.a(lt.ae, gjo.a::new);
      this.a(lt.af, gkq.a::new);
      this.a(lt.ag, gjw.a::new);
      this.a(lt.ah, gks.a::new);
      this.a(lt.ai, gjn.b::new);
      this.a(lt.aM, gjx.a::new);
      this.a(lt.aj, gkb.a::new);
      this.a(lt.al, ghz.a::new);
      this.a(lt.am, gkj.a::new);
      this.a(lt.ak, gke.b::new);
      this.a(lt.an, gkf.c::new);
      this.a(lt.ao, gkc.a::new);
      this.a(lt.ap, gka.d::new);
      this.a(lt.ax, gij::f);
      this.a(lt.ay, gij::g);
      this.a(lt.az, gij::h);
      this.a(lt.aA, gij::m);
      this.a(lt.aB, gij::n);
      this.a(lt.aF, gkf.b::new);
      this.a(lt.aC, ghy.a::new);
      this.a(lt.aD, gkf.a::new);
      this.a(lt.aE, gkf.d::new);
      this.a(lt.aG, gij::o);
      this.a(lt.aH, gij::p);
      this.a(lt.aI, gij::q);
      this.a(lt.aJ, gjp.a::new);
      this.a(lt.aK, gkr.a::new);
      this.a(lt.aL, git.b::new);
      this.a(lt.aP, gij::i);
      this.a(lt.aQ, gij::j);
      this.a(lt.H, gir.a::new);
      this.a(lt.I, gir.b::new);
      this.a(lt.aN, gij::k);
      this.a(lt.aO, gij::l);
      this.a(lt.U, gkn.a::new);
      this.a(lt.V, gkl.a::new);
      this.a(lt.aR, gke.a::new);
      this.a(lt.aS, giw.b::new);
      this.a(lt.aT, giw.e::new);
      this.a(lt.aU, giw.d::new);
      this.a(lt.aV, giw.a::new);
      this.a(lt.aW, giw.c::new);
      this.a(lt.aX, gjt.a::new);
      this.a(lt.aY, gkg.c::new);
      this.a(lt.aZ, gin.a::new);
      this.a(lt.ba, gkm.a::new);
      this.a(lt.bb, gkm.a::new);
      this.a(lt.bc, giv.c::new);
      this.a(lt.bd, new gkh.b());
      this.a(lt.bf, gka.c::new);
      this.a(lt.bg, gka.c::new);
      this.a(lt.be, giu.a::new);
      this.a(lt.bh, new gkh.a());
   }

   private <T extends lr> void a(ls<T> $$0, gjl<T> $$1) {
      this.k.put(mb.i.a($$0), $$1);
   }

   private <T extends lr> void a(ls<T> $$0, gjl.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            gki $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends lr> void a(ls<T> $$0, gjk.c<T> $$1) {
      gjk.b $$2 = new gjk.b();
      this.m.put(mb.i.b($$0), $$2);
      this.k.put(mb.i.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(auj.a $$0, aup $$1, Executor $$2, Executor $$3) {
      record a(akv a, Optional<List<akv>> b) {
      }

      CompletableFuture<List<a>> $$4 = CompletableFuture.<Map<akv, aun>>supplyAsync(() -> c.a($$1), $$2).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            akv $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$2));
         });
         return af.d($$2x);
      });
      CompletableFuture<heo.a> $$5 = heo.a(this.n).a($$1, d, 0, $$2).thenCompose(heo.a::a);
      return CompletableFuture.allOf($$5, $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> {
         this.f();
         bou $$3x = bot.a();
         $$3x.a("upload");
         heo.a $$4x = $$5.join();
         this.n.a($$4x);
         $$3x.b("bindSpriteSets");
         Set<akv> $$5x = new HashSet<>();
         het $$6 = $$4x.e();
         $$4.join().forEach($$3xx -> {
            Optional<List<akv>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<het> $$5xx = new ArrayList<>();

               for (akv $$6x : $$4xx.get()) {
                  het $$7 = $$4x.f().get($$6x);
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

               this.m.get($$3xx.a()).a($$5xx);
            }
         });
         if (!$$5x.isEmpty()) {
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(akv::toString).collect(Collectors.joining(",")));
         }

         $$3x.c();
      }, $$3);
   }

   public void a() {
      this.n.f();
   }

   private Optional<List<akv>> a(akv $$0, aun $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               gjj $$3 = gjj.a(ayp.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bum $$0, lr $$1) {
      this.h.add(new gkk(this.a, $$0, $$1));
   }

   public void a(bum $$0, lr $$1, int $$2) {
      this.h.add(new gkk(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public gji a(lr $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gji $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends lr> gji b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gjl<T> $$7 = (gjl<T>)this.k.get(mb.i.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(gji $$0) {
      Optional<lq> $$1 = $$0.o();
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
         bot.a().a($$0.toString());
         this.a($$1x);
         bot.a().c();
      });
      if (!this.h.isEmpty()) {
         List<gkk> $$0 = Lists.newArrayList();

         for (gkk $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      gji $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<gji> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<gji> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            gji $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(lq $$0, int $$1) {
      this.o.addTo($$0, $$1);
   }

   private void b(gji $$0) {
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

   public void a(fks $$0, float $$1, glz.a $$2) {
      for (gjm $$3 : f) {
         Queue<gji> $$4 = this.g.get($$3);
         if ($$4 != null && !$$4.isEmpty()) {
            a($$0, $$1, $$2, $$3, $$4);
         }
      }

      Queue<gji> $$5 = this.g.get(gjm.d);
      if ($$5 != null && !$$5.isEmpty()) {
         a($$0, $$1, $$2, $$5);
      }

      $$2.b();
   }

   private static void a(fks $$0, float $$1, glz.a $$2, gjm $$3, Queue<gji> $$4) {
      ffz $$5 = $$2.getBuffer(Objects.requireNonNull($$3.b()));

      for (gji $$6 : $$4) {
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

   private static void a(fks $$0, float $$1, glz.a $$2, Queue<gji> $$3) {
      ffv $$4 = new ffv();

      for (gji $$5 : $$3) {
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

   public void a(@Nullable gga $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(ji $$0, dwy $$1) {
      if (!$$1.l() && $$1.D()) {
         fbv $$2 = $$1.f(this.a, $$0);
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
                           new gkh(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(ji $$0, jn $$1) {
      dwy $$2 = this.a.a_($$0);
      if ($$2.o() != dpy.a && $$2.D()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         faw $$7 = $$2.f(this.a, $$0).a();
         double $$8 = (double)$$3 + this.j.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.j.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.j.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == jn.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == jn.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == jn.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == jn.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == jn.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == jn.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new gkh(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(lq $$0) {
      return this.o.getInt($$0) < $$0.a();
   }

   private void f() {
      this.g.clear();
      this.l.clear();
      this.h.clear();
      this.o.clear();
   }

   static class b implements gkd {
      private List<het> a;

      @Override
      public het a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public het a(azh $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<het> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends lr> {
      gjl<T> create(gkd var1);
   }
}
