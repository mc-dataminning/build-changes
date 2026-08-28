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

public class gip implements avf {
   private static final Logger b = LogUtils.getLogger();
   private static final ali c = ali.a("particles");
   private static final alp d = alp.b("particles");
   private static final int e = 16384;
   private static final List<gir> f = List.of(gir.a, gir.b, gir.c);
   protected gff a;
   private final Map<gir, Queue<gin>> g = Maps.newIdentityHashMap();
   private final Queue<gjp> h = Queues.newArrayDeque();
   private final hbh i;
   private final bac j = bac.a();
   private final Int2ObjectMap<giq<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<gin> l = Queues.newArrayDeque();
   private final Map<alp, gip.b> m = Maps.newHashMap();
   private final hbf n;
   private final Object2IntOpenHashMap<lp> o = new Object2IntOpenHashMap();

   public gip(gff $$0, hbh $$1) {
      this.n = new hbf(hbf.e);
      $$1.a(this.n.h(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(ls.a, gie.a::new);
      this.a(ls.c, new ghg.a());
      this.a(ls.b, new gjm.c());
      this.a(ls.d, ghj.a::new);
      this.a(ls.as, ghi.a::new);
      this.a(ls.aq, ghk.a::new);
      this.a(ls.av, ghl.a::new);
      this.a(ls.aw, ghl.b::new);
      this.a(ls.e, gis.a::new);
      this.a(ls.Q, gjl.a::new);
      this.a(ls.f, ghm.c::new);
      this.a(ls.ar, gju.a::new);
      this.a(ls.g, ghm.a::new);
      this.a(ls.h, ghn.a::new);
      this.a(ls.au, gjl.b::new);
      this.a(ls.i, gho::c);
      this.a(ls.j, gho::d);
      this.a(ls.k, gho::e);
      this.a(ls.l, gho::a);
      this.a(ls.m, gho::b);
      this.a(ls.n, ghq.a::new);
      this.a(ls.o, ghp.a::new);
      this.a(ls.p, gjf.c::new);
      this.a(ls.q, new gik.a());
      this.a(ls.r, ghm.b::new);
      this.a(ls.s, gia.a::new);
      this.a(ls.t, ght.a::new);
      this.a(ls.u, gjf.b::new);
      this.a(ls.v, new gig.a());
      this.a(ls.w, gif.a::new);
      this.a(ls.B, gjd.a::new);
      this.a(ls.C, ghv.a::new);
      this.a(ls.x, gic.a::new);
      this.a(ls.y, gic.b::new);
      this.a(ls.z, new gid.a(3.0, 7, 0));
      this.a(ls.A, new gid.a(1.0, 3, 2));
      this.a(ls.D, ghx.d::new);
      this.a(ls.E, gjt.a::new);
      this.a(ls.F, ghy.a::new);
      this.a(ls.G, gjf.c::new);
      this.a(ls.J, gje.a::new);
      this.a(ls.K, giw.a::new);
      this.a(ls.L, gix.a::new);
      this.a(ls.N, gje.b::new);
      this.a(ls.M, ghy.a::new);
      this.a(ls.O, ghx.a::new);
      this.a(ls.P, gjl.d::new);
      this.a(ls.R, gie.b::new);
      this.a(ls.S, gjf.a::new);
      this.a(ls.T, new ghh.b());
      this.a(ls.W, new ghh.c());
      this.a(ls.X, new ghh.a());
      this.a(ls.Y, new ghh.d());
      this.a(ls.Z, gii.a::new);
      this.a(ls.aa, gij.a::new);
      this.a(ls.ab, gjl.e::new);
      this.a(ls.at, gia.b::new);
      this.a(ls.ac, gim.a::new);
      this.a(ls.ad, ghu.a::new);
      this.a(ls.ae, git.a::new);
      this.a(ls.af, gjv.a::new);
      this.a(ls.ag, gjb.a::new);
      this.a(ls.ah, gjx.a::new);
      this.a(ls.ai, gis.b::new);
      this.a(ls.aM, gjc.a::new);
      this.a(ls.aj, gjg.a::new);
      this.a(ls.al, ghe.a::new);
      this.a(ls.am, gjo.a::new);
      this.a(ls.ak, gjj.b::new);
      this.a(ls.an, gjk.c::new);
      this.a(ls.ao, gjh.a::new);
      this.a(ls.ap, gjf.d::new);
      this.a(ls.ax, gho::f);
      this.a(ls.ay, gho::g);
      this.a(ls.az, gho::h);
      this.a(ls.aA, gho::m);
      this.a(ls.aB, gho::n);
      this.a(ls.aF, gjk.b::new);
      this.a(ls.aC, ghd.a::new);
      this.a(ls.aD, gjk.a::new);
      this.a(ls.aE, gjk.d::new);
      this.a(ls.aG, gho::o);
      this.a(ls.aH, gho::p);
      this.a(ls.aI, gho::q);
      this.a(ls.aJ, giu.a::new);
      this.a(ls.aK, gjw.a::new);
      this.a(ls.aL, ghy.b::new);
      this.a(ls.aP, gho::i);
      this.a(ls.aQ, gho::j);
      this.a(ls.H, ghw.a::new);
      this.a(ls.I, ghw.b::new);
      this.a(ls.aN, gho::k);
      this.a(ls.aO, gho::l);
      this.a(ls.U, gjs.a::new);
      this.a(ls.V, gjq.a::new);
      this.a(ls.aR, gjj.a::new);
      this.a(ls.aS, gib.b::new);
      this.a(ls.aT, gib.e::new);
      this.a(ls.aU, gib.d::new);
      this.a(ls.aV, gib.a::new);
      this.a(ls.aW, gib.c::new);
      this.a(ls.aX, giy.a::new);
      this.a(ls.aY, gjl.c::new);
      this.a(ls.aZ, ghs.a::new);
      this.a(ls.ba, gjr.a::new);
      this.a(ls.bb, gjr.a::new);
      this.a(ls.bc, gia.c::new);
      this.a(ls.bd, new gjm.b());
      this.a(ls.bf, gjf.c::new);
      this.a(ls.bg, gjf.c::new);
      this.a(ls.be, ghz.a::new);
      this.a(ls.bh, new gjm.a());
   }

   private <T extends lq> void a(lr<T> $$0, giq<T> $$1) {
      this.k.put(ma.i.a($$0), $$1);
   }

   private <T extends lq> void a(lr<T> $$0, giq.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            gjn $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends lq> void a(lr<T> $$0, gip.c<T> $$1) {
      gip.b $$2 = new gip.b();
      this.m.put(ma.i.b($$0), $$2);
      this.k.put(ma.i.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(avf.a $$0, avl $$1, Executor $$2, Executor $$3) {
      record a(alp a, Optional<List<alp>> b) {
      }

      CompletableFuture<List<a>> $$4 = CompletableFuture.<Map<alp, avj>>supplyAsync(() -> c.a($$1), $$2).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            alp $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$2));
         });
         return ae.d($$2x);
      });
      CompletableFuture<hbb.a> $$5 = hbb.a(this.n).a($$1, d, 0, $$2).thenCompose(hbb.a::a);
      return CompletableFuture.allOf($$5, $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> {
         this.f();
         bpj $$3x = bpi.a();
         $$3x.a("upload");
         hbb.a $$4x = $$5.join();
         this.n.a($$4x);
         $$3x.b("bindSpriteSets");
         Set<alp> $$5x = new HashSet<>();
         hbg $$6 = $$4x.e();
         $$4.join().forEach($$3xx -> {
            Optional<List<alp>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<hbg> $$5xx = new ArrayList<>();

               for (alp $$6x : $$4xx.get()) {
                  hbg $$7 = $$4x.f().get($$6x);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(alp::toString).collect(Collectors.joining(",")));
         }

         $$3x.c();
      }, $$3);
   }

   public void a() {
      this.n.g();
   }

   private Optional<List<alp>> a(alp $$0, avj $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               gio $$3 = gio.a(azk.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bvb $$0, lq $$1) {
      this.h.add(new gjp(this.a, $$0, $$1));
   }

   public void a(bvb $$0, lq $$1, int $$2) {
      this.h.add(new gjp(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public gin a(lq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gin $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends lq> gin b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      giq<T> $$7 = (giq<T>)this.k.get(ma.i.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(gin $$0) {
      Optional<lp> $$1 = $$0.o();
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
         bpi.a().a($$0.toString());
         this.a($$1x);
         bpi.a().c();
      });
      if (!this.h.isEmpty()) {
         List<gjp> $$0 = Lists.newArrayList();

         for (gjp $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      gin $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<gin> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<gin> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            gin $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(lp $$0, int $$1) {
      this.o.addTo($$0, $$1);
   }

   private void b(gin $$0) {
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

   public void a(fli $$0, float $$1, glg.a $$2) {
      for (gir $$3 : f) {
         Queue<gin> $$4 = this.g.get($$3);
         if ($$4 != null && !$$4.isEmpty()) {
            a($$0, $$1, $$2, $$3, $$4);
         }
      }

      Queue<gin> $$5 = this.g.get(gir.d);
      if ($$5 != null && !$$5.isEmpty()) {
         a($$0, $$1, $$2, $$5);
      }

      $$2.b();
   }

   private static void a(fli $$0, float $$1, glg.a $$2, gir $$3, Queue<gin> $$4) {
      fgp $$5 = $$2.getBuffer(Objects.requireNonNull($$3.b()));

      for (gin $$6 : $$4) {
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

   private static void a(fli $$0, float $$1, glg.a $$2, Queue<gin> $$3) {
      fgl $$4 = new fgl();

      for (gin $$5 : $$3) {
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

   public void a(@Nullable gff $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(jh $$0, dxo $$1) {
      if (!$$1.l() && $$1.D()) {
         fcl $$2 = $$1.f(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, azu.c($$8 / 0.25));
               int $$12 = Math.max(2, azu.c($$9 / 0.25));
               int $$13 = Math.max(2, azu.c($$10 / 0.25));

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
                           new gjm(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(jh $$0, jm $$1) {
      dxo $$2 = this.a.a_($$0);
      if ($$2.o() != dqo.a && $$2.D()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         fbm $$7 = $$2.f(this.a, $$0).a();
         double $$8 = (double)$$3 + this.j.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.j.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.j.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == jm.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == jm.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == jm.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == jm.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == jm.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == jm.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new gjm(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String d() {
      return String.valueOf(this.g.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(lp $$0) {
      return this.o.getInt($$0) < $$0.a();
   }

   private void f() {
      this.g.clear();
      this.l.clear();
      this.h.clear();
      this.o.clear();
   }

   static class b implements gji {
      private List<hbg> a;

      @Override
      public hbg a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public hbg a(bac $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<hbg> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends lq> {
      giq<T> create(gji var1);
   }
}
