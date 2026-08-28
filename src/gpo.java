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

public class gpo implements avb {
   private static final Logger b = LogUtils.getLogger();
   private static final ald c = ald.a("particles");
   private static final int d = 16384;
   private static final List<gpq> e = List.of(gpq.a, gpq.b, gpq.c);
   protected gmd a;
   private final Map<gpq, Queue<gpm>> f = Maps.newIdentityHashMap();
   private final Queue<gqo> g = Queues.newArrayDeque();
   private final azz h = azz.a();
   private final Int2ObjectMap<gpp<?>> i = new Int2ObjectOpenHashMap();
   private final Queue<gpm> j = Queues.newArrayDeque();
   private final Map<alk, gpo.b> k = Maps.newHashMap();
   private final hlb l;
   private final Object2IntOpenHashMap<lw> m = new Object2IntOpenHashMap();

   public gpo(gmd $$0, hle $$1) {
      this.l = new hlb(hlb.d);
      $$1.a(this.l.e(), this.l);
      this.a = $$0;
      this.d();
   }

   private void d() {
      this.a(lz.a, gpd.a::new);
      this.a(lz.c, new goe.a());
      this.a(lz.b, new gql.c());
      this.a(lz.d, goh.a::new);
      this.a(lz.at, gog.a::new);
      this.a(lz.ar, goi.a::new);
      this.a(lz.aw, goj.a::new);
      this.a(lz.ax, goj.b::new);
      this.a(lz.e, gpr.a::new);
      this.a(lz.R, gqk.a::new);
      this.a(lz.f, gok.c::new);
      this.a(lz.as, gqt.a::new);
      this.a(lz.g, gok.a::new);
      this.a(lz.h, gol.a::new);
      this.a(lz.av, gqk.b::new);
      this.a(lz.i, gom::c);
      this.a(lz.j, gom::d);
      this.a(lz.k, gom::e);
      this.a(lz.l, gom::a);
      this.a(lz.m, gom::b);
      this.a(lz.n, goo.a::new);
      this.a(lz.o, gon.a::new);
      this.a(lz.p, gqe.c::new);
      this.a(lz.q, new gpj.a());
      this.a(lz.r, gok.b::new);
      this.a(lz.s, goz.a::new);
      this.a(lz.t, gor.a::new);
      this.a(lz.u, gqe.b::new);
      this.a(lz.v, new gpf.a());
      this.a(lz.w, gpe.a::new);
      this.a(lz.B, gqc.a::new);
      this.a(lz.C, got.a::new);
      this.a(lz.x, gpb.a::new);
      this.a(lz.y, gpb.b::new);
      this.a(lz.z, new gpc.a(3.0, 7, 0));
      this.a(lz.A, new gpc.a(1.0, 3, 2));
      this.a(lz.D, gow.d::new);
      this.a(lz.E, gqs.a::new);
      this.a(lz.F, gox.a::new);
      this.a(lz.G, gqe.c::new);
      this.a(lz.K, gqd.a::new);
      this.a(lz.L, gpv.a::new);
      this.a(lz.M, gpw.a::new);
      this.a(lz.O, gqd.b::new);
      this.a(lz.N, gox.a::new);
      this.a(lz.P, gow.a::new);
      this.a(lz.Q, gqk.d::new);
      this.a(lz.S, gpd.b::new);
      this.a(lz.T, gqe.a::new);
      this.a(lz.U, new gof.c());
      this.a(lz.X, new gof.d());
      this.a(lz.Y, new gof.a());
      this.a(lz.Z, new gof.e());
      this.a(lz.aa, gph.a::new);
      this.a(lz.ab, gpi.a::new);
      this.a(lz.ac, gqk.e::new);
      this.a(lz.au, goz.b::new);
      this.a(lz.ad, gpl.a::new);
      this.a(lz.ae, gos.a::new);
      this.a(lz.af, gps.a::new);
      this.a(lz.ag, gqu.a::new);
      this.a(lz.ah, gqa.a::new);
      this.a(lz.ai, gqw.a::new);
      this.a(lz.aj, gpr.b::new);
      this.a(lz.aN, gqb.a::new);
      this.a(lz.ak, gqf.a::new);
      this.a(lz.am, goc.a::new);
      this.a(lz.an, gqn.a::new);
      this.a(lz.al, gqi.b::new);
      this.a(lz.ao, gqj.c::new);
      this.a(lz.ap, gqg.a::new);
      this.a(lz.aq, gqe.d::new);
      this.a(lz.ay, gom::f);
      this.a(lz.az, gom::g);
      this.a(lz.aA, gom::h);
      this.a(lz.aB, gom::m);
      this.a(lz.aC, gom::n);
      this.a(lz.aG, gqj.b::new);
      this.a(lz.aD, gob.a::new);
      this.a(lz.aE, gqj.a::new);
      this.a(lz.aF, gqj.d::new);
      this.a(lz.aH, gom::o);
      this.a(lz.aI, gom::p);
      this.a(lz.aJ, gom::q);
      this.a(lz.aK, gpt.a::new);
      this.a(lz.aL, gqv.a::new);
      this.a(lz.aM, gox.b::new);
      this.a(lz.aQ, gom::i);
      this.a(lz.aR, gom::j);
      this.a(lz.H, gou.a::new);
      this.a(lz.I, gou.b::new);
      this.a(lz.J, gou.c::new);
      this.a(lz.aO, gom::k);
      this.a(lz.aP, gom::l);
      this.a(lz.V, gqr.a::new);
      this.a(lz.W, gqp.a::new);
      this.a(lz.aS, gqi.a::new);
      this.a(lz.aT, gpa.b::new);
      this.a(lz.aU, gpa.e::new);
      this.a(lz.aV, gpa.d::new);
      this.a(lz.aW, gpa.a::new);
      this.a(lz.aX, gpa.c::new);
      this.a(lz.aY, gpx.a::new);
      this.a(lz.aZ, gqk.c::new);
      this.a(lz.ba, goq.a::new);
      this.a(lz.bb, gqq.a::new);
      this.a(lz.bc, gqq.a::new);
      this.a(lz.bd, goz.c::new);
      this.a(lz.be, new gql.b());
      this.a(lz.bg, gqe.c::new);
      this.a(lz.bh, gqe.c::new);
      this.a(lz.bf, goy.a::new);
      this.a(lz.bi, new gql.a());
      this.a(lz.bj, gov.a::new);
   }

   private <T extends lx> void a(ly<T> $$0, gpp<T> $$1) {
      this.i.put(mh.i.a($$0), $$1);
   }

   private <T extends lx> void a(ly<T> $$0, gpp.a<T> $$1) {
      this.a($$0, $$1x -> ($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9) -> {
            gqm $$10 = $$1.createParticle($$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            if ($$10 != null) {
               $$10.a($$1x);
            }

            return $$10;
         });
   }

   private <T extends lx> void a(ly<T> $$0, gpo.c<T> $$1) {
      gpo.b $$2 = new gpo.b();
      this.k.put(mh.i.b($$0), $$2);
      this.i.put(mh.i.a($$0), $$1.create($$2));
   }

   @Override
   public CompletableFuture<Void> reload(avb.a $$0, avh $$1, Executor $$2, Executor $$3) {
      record a(alk a, Optional<List<alk>> b) {
      }

      CompletableFuture<List<a>> $$4 = CompletableFuture.<Map<alk, avf>>supplyAsync(() -> c.a($$1), $$2).thenCompose($$1x -> {
         List<CompletableFuture<a>> $$2x = new ArrayList<>($$1x.size());
         $$1x.forEach(($$2xx, $$3x) -> {
            alk $$4x = c.b($$2xx);
            $$2x.add(CompletableFuture.supplyAsync(() -> new a($$4x, this.a($$4x, $$3x)), $$2));
         });
         return ag.d($$2x);
      });
      CompletableFuture<hkx.a> $$5 = hkx.a(this.l).a($$1, hnb.k, 0, $$2).thenCompose(hkx.a::a);
      return CompletableFuture.allOf($$5, $$4).thenCompose($$0::wait).thenAcceptAsync($$2x -> {
         this.e();
         brd $$3x = brc.a();
         $$3x.a("upload");
         hkx.a $$4x = $$5.join();
         this.l.a($$4x);
         $$3x.b("bindSpriteSets");
         Set<alk> $$5x = new HashSet<>();
         hlc $$6 = $$4x.e();
         $$4.join().forEach($$3xx -> {
            Optional<List<alk>> $$4xx = $$3xx.b();
            if (!$$4xx.isEmpty()) {
               List<hlc> $$5xx = new ArrayList<>();

               for (alk $$6x : $$4xx.get()) {
                  hlc $$7 = $$4x.f().get($$6x);
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

               this.k.get($$3xx.a()).a($$5xx);
            }
         });
         if (!$$5x.isEmpty()) {
            b.warn("Missing particle sprites: {}", $$5x.stream().sorted().map(alk::toString).collect(Collectors.joining(",")));
         }

         $$3x.c();
      }, $$3);
   }

   public void a() {
      this.l.d();
   }

   private Optional<List<alk>> a(alk $$0, avf $$1) {
      if (!this.k.containsKey($$0)) {
         b.debug("Redundant texture list for particle: {}", $$0);
         return Optional.empty();
      } else {
         try {
            Optional var5;
            try (Reader $$2 = $$1.e()) {
               gpn $$3 = gpn.a(azg.a($$2));
               var5 = Optional.of($$3.a());
            }

            return var5;
         } catch (IOException var8) {
            throw new IllegalStateException("Failed to load description for particle " + $$0, var8);
         }
      }
   }

   public void a(bwv $$0, lx $$1) {
      this.g.add(new gqo(this.a, $$0, $$1));
   }

   public void a(bwv $$0, lx $$1, int $$2) {
      this.g.add(new gqo(this.a, $$0, $$1, $$2));
   }

   @Nullable
   public gpm a(lx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gpm $$7 = this.b($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      if ($$7 != null) {
         this.a($$7);
         return $$7;
      } else {
         return null;
      }
   }

   @Nullable
   private <T extends lx> gpm b(T $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      gpp<T> $$7 = (gpp<T>)this.i.get(mh.i.a($$0.a()));
      return $$7 == null ? null : $$7.createParticle($$0, this.a, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public void a(gpm $$0) {
      Optional<lw> $$1 = $$0.o();
      if ($$1.isPresent()) {
         if (this.a($$1.get())) {
            this.j.add($$0);
            this.a($$1.get(), 1);
         }
      } else {
         this.j.add($$0);
      }
   }

   public void b() {
      this.f.forEach(($$0, $$1x) -> {
         brc.a().a($$0.toString());
         this.a($$1x);
         brc.a().c();
      });
      if (!this.g.isEmpty()) {
         List<gqo> $$0 = Lists.newArrayList();

         for (gqo $$1 : this.g) {
            $$1.a();
            if (!$$1.m()) {
               $$0.add($$1);
            }
         }

         this.g.removeAll($$0);
      }

      gpm $$2;
      if (!this.j.isEmpty()) {
         while (($$2 = this.j.poll()) != null) {
            this.f.computeIfAbsent($$2.b(), $$0 -> EvictingQueue.create(16384)).add($$2);
         }
      }
   }

   private void a(Collection<gpm> $$0) {
      if (!$$0.isEmpty()) {
         Iterator<gpm> $$1 = $$0.iterator();

         while ($$1.hasNext()) {
            gpm $$2 = $$1.next();
            this.b($$2);
            if (!$$2.m()) {
               $$2.o().ifPresent($$0x -> this.a($$0x, -1));
               $$1.remove();
            }
         }
      }
   }

   private void a(lw $$0, int $$1) {
      this.m.addTo($$0, $$1);
   }

   private void b(gpm $$0) {
      try {
         $$0.a();
      } catch (Throwable var5) {
         p $$2 = p.a(var5, "Ticking Particle");
         q $$3 = $$2.a("Particle being ticked");
         $$3.a("Particle", $$0::toString);
         $$3.a("Particle Type", $$0.b()::toString);
         throw new aa($$2);
      }
   }

   public void a(fqn $$0, float $$1, gsc.a $$2) {
      for (gpq $$3 : e) {
         Queue<gpm> $$4 = this.f.get($$3);
         if ($$4 != null && !$$4.isEmpty()) {
            a($$0, $$1, $$2, $$3, $$4);
         }
      }

      Queue<gpm> $$5 = this.f.get(gpq.d);
      if ($$5 != null && !$$5.isEmpty()) {
         a($$0, $$1, $$2, $$5);
      }

      $$2.b();
   }

   private static void a(fqn $$0, float $$1, gsc.a $$2, gpq $$3, Queue<gpm> $$4) {
      flt $$5 = $$2.getBuffer(Objects.requireNonNull($$3.b()));

      for (gpm $$6 : $$4) {
         try {
            $$6.a($$5, $$0, $$1);
         } catch (Throwable var11) {
            p $$8 = p.a(var11, "Rendering Particle");
            q $$9 = $$8.a("Particle being rendered");
            $$9.a("Particle", $$6::toString);
            $$9.a("Particle Type", $$3::toString);
            throw new aa($$8);
         }
      }
   }

   private static void a(fqn $$0, float $$1, gsc.a $$2, Queue<gpm> $$3) {
      flq $$4 = new flq();

      for (gpm $$5 : $$3) {
         try {
            $$5.a($$4, $$2, $$0, $$1);
         } catch (Throwable var10) {
            p $$7 = p.a(var10, "Rendering Particle");
            q $$8 = $$7.a("Particle being rendered");
            $$8.a("Particle", $$5::toString);
            $$8.a("Particle Type", "Custom");
            throw new aa($$7);
         }
      }
   }

   public void a(@Nullable gmd $$0) {
      this.a = $$0;
      this.e();
      this.g.clear();
   }

   public void a(iw $$0, ebg $$1) {
      if (!$$1.l() && $$1.D()) {
         fgm $$2 = $$1.f(this.a, $$0);
         double $$3 = 0.25;
         $$2.b(
            ($$2x, $$3x, $$4, $$5, $$6, $$7) -> {
               double $$8 = Math.min(1.0, $$5 - $$2x);
               double $$9 = Math.min(1.0, $$6 - $$3x);
               double $$10 = Math.min(1.0, $$7 - $$4);
               int $$11 = Math.max(2, azq.c($$8 / 0.25));
               int $$12 = Math.max(2, azq.c($$9 / 0.25));
               int $$13 = Math.max(2, azq.c($$10 / 0.25));

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
                           new gql(this.a, (double)$$0.u() + $$20, (double)$$0.v() + $$21, (double)$$0.w() + $$22, $$17 - 0.5, $$18 - 0.5, $$19 - 0.5, $$1, $$0)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void a(iw $$0, jc $$1) {
      ebg $$2 = this.a.a_($$0);
      if ($$2.o() != dtr.a && $$2.D()) {
         int $$3 = $$0.u();
         int $$4 = $$0.v();
         int $$5 = $$0.w();
         float $$6 = 0.1F;
         ffn $$7 = $$2.f(this.a, $$0).a();
         double $$8 = (double)$$3 + this.h.j() * ($$7.d - $$7.a - 0.2F) + 0.1F + $$7.a;
         double $$9 = (double)$$4 + this.h.j() * ($$7.e - $$7.b - 0.2F) + 0.1F + $$7.b;
         double $$10 = (double)$$5 + this.h.j() * ($$7.f - $$7.c - 0.2F) + 0.1F + $$7.c;
         if ($$1 == jc.a) {
            $$9 = (double)$$4 + $$7.b - 0.1F;
         }

         if ($$1 == jc.b) {
            $$9 = (double)$$4 + $$7.e + 0.1F;
         }

         if ($$1 == jc.c) {
            $$10 = (double)$$5 + $$7.c - 0.1F;
         }

         if ($$1 == jc.d) {
            $$10 = (double)$$5 + $$7.f + 0.1F;
         }

         if ($$1 == jc.e) {
            $$8 = (double)$$3 + $$7.a - 0.1F;
         }

         if ($$1 == jc.f) {
            $$8 = (double)$$3 + $$7.d + 0.1F;
         }

         this.a(new gql(this.a, $$8, $$9, $$10, 0.0, 0.0, 0.0, $$2, $$0).c(0.2F).d(0.6F));
      }
   }

   public String c() {
      return String.valueOf(this.f.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean a(lw $$0) {
      return this.m.getInt($$0) < $$0.a();
   }

   private void e() {
      this.f.clear();
      this.j.clear();
      this.g.clear();
      this.m.clear();
   }

   static class b implements gqh {
      private List<hlc> a;

      @Override
      public hlc a(int $$0, int $$1) {
         return this.a.get($$0 * (this.a.size() - 1) / $$1);
      }

      @Override
      public hlc a(azz $$0) {
         return this.a.get($$0.a(this.a.size()));
      }

      public void a(List<hlc> $$0) {
         this.a = ImmutableList.copyOf($$0);
      }
   }

   @FunctionalInterface
   interface c<T extends lx> {
      gpp<T> create(gqh var1);
   }
}
