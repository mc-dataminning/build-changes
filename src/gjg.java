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

public class gjg implements aui {
   private static final Logger b = LogUtils.getLogger();
   private static final akn c = akn.a("particles");
   private static final aku d = aku.b("particles");
   private static final int e = 16384;
   private static final List<gji> f = List.of(gji.a, gji.b, gji.c);
   protected gfw a;
   private final Map<gji, Queue<gje>> g = Maps.newIdentityHashMap();
   private final Queue<gkg> h = Queues.newArrayDeque();
   private final heo i;
   private final azg j = azg.a();
   private final Int2ObjectMap<gjh<?>> k = new Int2ObjectOpenHashMap();
   private final Queue<gje> l = Queues.newArrayDeque();
   private final Map<aku, gjg.b> m = Maps.newHashMap();
   private final hel n;
   private final Object2IntOpenHashMap<lq> o = new Object2IntOpenHashMap();

   public gjg(gfw $$0, heo $$1) {
      this.n = new hel(hel.e);
      $$1.a(this.n.h(), this.n);
      this.a = $$0;
      this.i = $$1;
      this.e();
   }

   private void e() {
      this.a(lt.a, giv.a::new);
      this.a(lt.c, new ghx.a());
      this.a(lt.b, new gkd.c());
      this.a(lt.d, gia.a::new);
      this.a(lt.as, ghz.a::new);
      this.a(lt.aq, gib.a::new);
      this.a(lt.av, gic.a::new);
      this.a(lt.aw, gic.b::new);
      this.a(lt.e, gjj.a::new);
      this.a(lt.Q, gkc.a::new);
      this.a(lt.f, gid.c::new);
      this.a(lt.ar, gkl.a::new);
      this.a(lt.g, gid.a::new);
      this.a(lt.h, gie.a::new);
      this.a(lt.au, gkc.b::new);
      this.a(lt.i, gif::c);
      this.a(lt.j, gif::d);
      this.a(lt.k, gif::e);
      this.a(lt.l, gif::a);
      this.a(lt.m, gif::b);
      this.a(lt.n, gih.a::new);
      this.a(lt.o, gig.a::new);
      this.a(lt.p, gjw.c::new);
      this.a(lt.q, new gjb.a());
      this.a(lt.r, gid.b::new);
      this.a(lt.s, gir.a::new);
      this.a(lt.t, gik.a::new);
      this.a(lt.u, gjw.b::new);
      this.a(lt.v, new gix.a());
      this.a(lt.w, giw.a::new);
      this.a(lt.B, gju.a::new);
      this.a(lt.C, gim.a::new);
      this.a(lt.x, git.a::new);
      this.a(lt.y, git.b::new);
      this.a(lt.z, new giu.a(3.0, 7, 0));
      this.a(lt.A, new giu.a(1.0, 3, 2));
      this.a(lt.D, gio.d::new);
      this.a(lt.E, gkk.a::new);
      this.a(lt.F, gip.a::new);
      this.a(lt.G, gjw.c::new);
      this.a(lt.J, gjv.a::new);
      this.a(lt.K, gjn.a::new);
      this.a(lt.L, gjo.a::new);
      this.a(lt.N, gjv.b::new);
      this.a(lt.M, gip.a::new);
      this.a(lt.O, gio.a::new);
      this.a(lt.P, gkc.d::new);
      this.a(lt.R, giv.b::new);
      this.a(lt.S, gjw.a::new);
      this.a(lt.T, new ghy.c());
      this.a(lt.W, new ghy.d());
      this.a(lt.X, new ghy.a());
      this.a(lt.Y, new ghy.e());
      this.a(lt.Z, giz.a::new);
      this.a(lt.aa, gja.a::new);
      this.a(lt.ab, gkc.e::new);
      this.a(lt.at, gir.b::new);
      this.a(lt.ac, gjd.a::new);
      this.a(lt.ad, gil.a::new);
      this.a(lt.ae, gjk.a::new);
      this.a(lt.af, gkm.a::new);
      this.a(lt.ag, gjs.a::new);
      this.a(lt.ah, gko.a::new);
      this.a(lt.ai, gjj.b::new);
      this.a(lt.aM, gjt.a::new);
      this.a(lt.aj, gjx.a::new);
      this.a(lt.al, ghv.a::new);
      this.a(lt.am, gkf.a::new);
      this.a(lt.ak, gka.b::new);
      this.a(lt.an, gkb.c::new);
      this.a(lt.ao, gjy.a::new);
      this.a(lt.ap, gjw.d::new);
      this.a(lt.ax, gif::f);
      this.a(lt.ay, gif::g);
      this.a(lt.az, gif::h);
      this.a(lt.aA, gif::m);
      this.a(lt.aB, gif::n);
      this.a(lt.aF, gkb.b::new);
      this.a(lt.aC, ghu.a::new);
      this.a(lt.aD, gkb.a::new);
      this.a(lt.aE, gkb.d::new);
      this.a(lt.aG, gif::o);
      this.a(lt.aH, gif::p);
      this.a(lt.aI, gif::q);
      this.a(lt.aJ, gjl.a::new);
      this.a(lt.aK, gkn.a::new);
      this.a(lt.aL, gip.b::new);
      this.a(lt.aP, gif::i);
      this.a(lt.aQ, gif::j);
      this.a(lt.H, gin.a::new);
      this.a(lt.I, gin.b::new);
      this.a(lt.aN, gif::k);
      this.a(lt.aO, gif::l);
      this.a(lt.U, gkj.a::new);
      this.a(lt.V, gkh.a::new);
      this.a(lt.aR, gka.a::new);
      this.a(lt.aS, gis.b::new);
      this.a(lt.aT, gis.e::new);
      this.a(lt.aU, gis.d::new);
      this.a(lt.aV, gis.a::new);
      this.a(lt.aW, gis.c::new);
      this.a(lt.aX, gjp.a::new);
      this.a(lt.aY, gkc.c::new);
      this.a(lt.aZ, gij.a::new);
      this.a(lt.ba, gki.a::new);
      this.a(lt.bb, gki.a::new);
      this.a(lt.bc, gir.c::new);
      this.a(lt.bd, new gkd.b());
      this.a(lt.bf, gjw.c::new);
      this.a(lt.bg, gjw.c::new);
      this.a(lt.be, giq.a::new);
      this.a(lt.bh, new gkd.a());
   }

   private <T extends lr> void a(ls<T> $$0, gjh<T> $$1) {
      this.k.put(mb.i.a($$0), $$1);
   }

   private <T extends lr> void a(ls<T> $$0, gjh.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            gke $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends lr> void a(ls<T> $$0, gjg.c<T> $$1) {
      gjg.b $$2 = new gjg.b();
      this.m.put(mb.i.b($$0), $$2);
      this.k.put(mb.i.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> a(aui.a $$0, auo $$1, Executor $$2, Executor $$3) {
      record a(aku a, Optional<List<aku>> b) {
      }

      CompletableFuture<List<a>> $$4 = CompletableFuture.<Map<aku, aum>>supplyAsync(() -> c.a($$1), $$2).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            aku $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$2));
         });
         return af.d($$2x);
      });
      CompletableFuture<heh.a> $$5 = heh.a(this.n).a($$1, d, 0, $$2).thenCompose(heh.a::a);
      return CompletableFuture.allOf($$5, $$4).thenCompose($$0::a).thenAcceptAsync($$2x -> {
         this.f();
         bor $$3x = boq.a();
         $$3x.a("upload");
         heh.a $$4x = $$5.join();
         this.n.a($$4x);
         $$3x.b("bindSpriteSets");
         Set<aku> $$5x = new HashSet<>();
         hem $$6 = $$4x.e();
         $$4.join().forEach($$3xx -> {
            Optional<List<aku>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<hem> $$5xx = new ArrayList<>();

               for (aku $$6x : $$4xx.get()) {
                  hem $$7 = $$4x.f().get($$6x);
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
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(aku::toString).collect(Collectors.joining(",")));
         }

         $$3x.c();
      }, $$3);
   }

   public void a() {
      this.n.g();
   }

   private Optional<List<aku>> a(aku $$0, aum $$1) {
      if (!this.m.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               gjf $$3 = gjf.a(ayo.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(buj $$0, lr $$1) {
      this.h.add(new gkg(this.a, $$0, $$1));
   }

   public void a(buj $$0, lr $$1, int $$2) {
      this.h.add(new gkg(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public gje a(lr $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gje $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends lr> gje b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gjh<T> $$7 = (gjh<T>)this.k.get(mb.i.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(gje $$0) {
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
         boq.a().a($$0.toString());
         this.a($$1x);
         boq.a().c();
      });
      if (!this.h.isEmpty()) {
         List<gkg> $$0 = Lists.newArrayList();

         for (gkg $$1 : this.h) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.h.removeAll($$0);
      }

      gje $$2;
      if (!this.l.isEmpty()) {
         while (($$2 = this.l.poll()) != null) {
            this.g.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<gje> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<gje> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            gje $$2 = $$1.next();
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

   private void b(gje $$0) {
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

   public void a(fkp $$0, float $$1, glv.a $$2) {
      for (gji $$3 : f) {
         Queue<gje> $$4 = this.g.get($$3);
         if ($$4 != null && !$$4.isEmpty()) {
            a($$0, $$1, $$2, $$3, $$4);
         }
      }

      Queue<gje> $$5 = this.g.get(gji.d);
      if ($$5 != null && !$$5.isEmpty()) {
         a($$0, $$1, $$2, $$5);
      }

      $$2.b();
   }

   private static void a(fkp $$0, float $$1, glv.a $$2, gji $$3, Queue<gje> $$4) {
      ffw $$5 = $$2.getBuffer(Objects.requireNonNull($$3.b()));

      for (gje $$6 : $$4) {
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

   private static void a(fkp $$0, float $$1, glv.a $$2, Queue<gje> $$3) {
      ffs $$4 = new ffs();

      for (gje $$5 : $$3) {
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

   public void a(@Nullable gfw $$0) {
      this.a = $$0;
      this.f();
      this.h.clear();
   }

   public void a(ji $$0, dwv $$1) {
      if (!$$1.l() && $$1.D()) {
         fbs $$2 = $$1.f(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, ayy.c($$8 / 0.25));
               int $$12 = Math.max(2, ayy.c($$9 / 0.25));
               int $$13 = Math.max(2, ayy.c($$10 / 0.25));

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
                           new gkd(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(ji $$0, jn $$1) {
      dwv $$2 = this.a.a_($$0);
      if ($$2.o() != dpv.a && $$2.D()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         fat $$7 = $$2.f(this.a, $$0).a();
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

         this.a(new gkd(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
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

   static class b implements gjz {
      private List<hem> a;

      @Override
      public hem a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public hem a(azg $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<hem> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends lr> {
      gjh<T> create(gjz var1);
   }
}
