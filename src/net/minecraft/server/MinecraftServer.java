package net.minecraft.server;

import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.net.Proxy;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.KeyPair;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import net.minecraft.obfuscate.DontObfuscate;
import org.slf4j.Logger;

public abstract class MinecraftServer extends bqm<amb> implements alu, dxw, et {
   private static final Logger l = LogUtils.getLogger();
   public static final String b = "vanilla";
   private static final float m = 0.8F;
   private static final int n = 100;
   private static final long o = 20L * bag.a / 20L;
   private static final int p = 20;
   private static final long q = 10L * bag.a;
   private static final int r = 100;
   private static final long s = 5L * bag.a;
   private static final long t = 10L * bag.b;
   private static final int u = 12;
   private static final int v = 5;
   private static final int w = 6000;
   private static final int x = 100;
   private static final int y = 3;
   public static final int c = 29999984;
   public static final den d = new den("Demo World", deg.a, false, brp.c, false, new def(cqs.i), dff.c);
   public static final GameProfile e = new GameProfile(ad.e, "Anonymous Player");
   protected final esz.c f;
   protected final etc g;
   private final List<Runnable> z = Lists.newArrayList();
   private bpu A = bpt.a;
   private bog B = this.A.f();
   private Consumer<bof> C = $$0x -> this.aV();
   private Consumer<Path> D = $$0x -> {
   };
   private boolean E;
   @Nullable
   private MinecraftServer.c F;
   private boolean G;
   private final ask H;
   private final art I;
   @Nullable
   private akb J;
   @Nullable
   private akb.a K;
   private final azn L = azn.a();
   private final DataFixer M;
   private String N;
   private int O = -1;
   private final jv<aln> P;
   private final Map<ald<dej>, arj> Q = Maps.newLinkedHashMap();
   private avj R;
   private volatile boolean S = true;
   private boolean T;
   private int U;
   private int V = 6000;
   protected final Proxy h;
   private boolean W;
   private boolean X;
   private boolean Y;
   private boolean Z;
   @Nullable
   private String aa;
   private int ab;
   private final long[] ac = new long[100];
   private long ad = 0L;
   @Nullable
   private KeyPair ae;
   @Nullable
   private GameProfile af;
   private boolean ag;
   private volatile boolean ah;
   private long ai;
   protected final alz i;
   private long aj;
   private final Thread ak;
   private long al = ad.d();
   private long am = ad.d();
   private long an;
   private long ao = ad.d();
   private boolean ap = false;
   private long aq;
   private boolean ar;
   private final aug as;
   private final alx at = new alx(this);
   @Nullable
   private esq au;
   private final amh av = new amh();
   private final alt aw;
   private boolean ax;
   private float ay;
   private final Executor az;
   @Nullable
   private String aA;
   private MinecraftServer.a aB;
   private final epj aC;
   private final aly aD;
   protected final etf j;
   private final cxq aE;
   private dss aF;
   private int aG;
   private volatile boolean aH;
   private static final AtomicReference<RuntimeException> aI = new AtomicReference<>();
   private final ama aJ = new ama();

   public static <S extends MinecraftServer> S a(Function<Thread, S> $$0) {
      AtomicReference<S> $$1 = new AtomicReference<>();
      Thread $$2 = new Thread(() -> $$1.get().y(), "Server thread");
      $$2.setUncaughtExceptionHandler(($$0x, $$1x) -> l.error("Uncaught exception in server thread", $$1x));
      if (Runtime.getRuntime().availableProcessors() > 4) {
         $$2.setPriority(8);
      }

      S $$3 = (S)$$0.apply($$2);
      $$1.set($$3);
      $$2.start();
      return $$3;
   }

   public MinecraftServer(Thread $$0, esz.c $$1, aug $$2, amd $$3, Proxy $$4, DataFixer $$5, alz $$6, art $$7) {
      super("Server");
      this.P = $$3.c();
      this.j = $$3.d();
      if (!this.P.a().e(lw.bd).e(dyp.b)) {
         throw new IllegalStateException("Missing Overworld dimension data");
      } else {
         this.h = $$4;
         this.as = $$2;
         this.aB = new MinecraftServer.a($$3.a(), $$3.b());
         this.i = $$6;
         if ($$6.f() != null) {
            $$6.f().a(this);
         }

         this.H = new ask(this);
         this.aD = new aly(this);
         this.I = $$7;
         this.f = $$1;
         this.g = $$1.g();
         this.M = $$5;
         this.aw = new alt(this, this.aB.b.a());
         jp<dhm> $$8 = this.P.a().e(lw.f).a(this.j.K());
         this.aC = new epj($$3.a(), $$1, $$5, $$8);
         this.ak = $$0;
         this.az = ad.g();
         this.aE = cxq.a(this.j.K());
         this.aB.b.c().a();
         this.aF = dss.a(this.P.a(), this.j.K());
      }
   }

   private void a(est $$0) {
      $$0.a(this.aJ().b(), "scoreboard");
   }

   protected abstract boolean e() throws IOException;

   protected void t_() {
      if (!bom.f.c()) {
      }

      boolean $$0 = false;
      bop $$1 = bom.f.e();
      this.j.a(this.getServerModName(), this.Q().a());
      ars $$2 = this.I.create(this.j.o().c(def.aa));
      this.a($$2);
      this.t();
      this.b($$2);
      if ($$1 != null) {
         $$1.finish();
      }

      if ($$0) {
         try {
            bom.f.b();
         } catch (Throwable var5) {
            l.warn("Failed to stop JFR profiling", var5);
         }
      }
   }

   protected void t() {
   }

   protected void a(ars $$0) {
      ete $$1 = this.j.I();
      boolean $$2 = this.j.A();
      kb<dyp> $$3 = this.P.a().e(lw.bd);
      ebm $$4 = this.j.y();
      long $$5 = $$4.b();
      long $$6 = dfm.a($$5);
      List<ddv> $$7 = ImmutableList.of(new eba(), new eaz(), new cng(), new cfo(), new cnr($$1));
      dyp $$8 = $$3.c(dyp.b);
      arj $$9 = new arj(this, this.az, this.f, $$1, dej.h, $$8, $$0, $$2, $$6, $$7, true, null);
      this.Q.put(dej.h, $$9);
      est $$10 = $$9.u();
      this.a($$10);
      this.au = new esq($$10);
      dwj $$11 = $$9.B_();
      if (!$$1.n()) {
         try {
            a($$9, $$1, $$4.d(), $$2);
            $$1.c(true);
            if ($$2) {
               this.a(this.j);
            }
         } catch (Throwable var23) {
            o $$13 = o.a(var23, "Exception initializing level");

            try {
               $$9.a($$13);
            } catch (Throwable var22) {
            }

            throw new z($$13);
         }

         $$1.c(true);
      }

      this.ag().a($$9);
      if (this.j.E() != null) {
         this.aM().a(this.j.E(), this.bb());
      }

      brx $$14 = $$9.M();

      for (Entry<ald<dyp>, dyp> $$15 : $$3.k()) {
         ald<dyp> $$16 = $$15.getKey();
         if ($$16 != dyp.b) {
            ald<dej> $$17 = ald.a(lw.bc, $$16.a());
            ess $$18 = new ess(this.j, $$1);
            arj $$19 = new arj(this, this.az, this.f, $$18, $$17, $$15.getValue(), $$0, $$2, $$6, ImmutableList.of(), false, $$14);
            $$11.a(new dwh.a($$19.B_()));
            this.Q.put($$17, $$19);
         }
      }

      $$11.a($$1.p());
   }

   private static void a(arj $$0, ete $$1, boolean $$2, boolean $$3) {
      if ($$3) {
         $$1.a(jf.c.b(80), 0.0F);
      } else {
         arh $$4 = $$0.l();
         ddp $$5 = new ddp($$4.i().b().a());
         int $$6 = $$4.g().a($$0);
         if ($$6 < $$0.H_()) {
            jf $$7 = $$5.l();
            $$6 = $$0.a(eao.a.b, $$7.u() + 8, $$7.w() + 8);
         }

         $$1.a($$5.l().b(8, $$6, 8), 0.0F);
         int $$8 = 0;
         int $$9 = 0;
         int $$10 = 0;
         int $$11 = -1;

         for (int $$12 = 0; $$12 < azf.h(11); $$12++) {
            if ($$8 >= -5 && $$8 <= 5 && $$9 >= -5 && $$9 <= 5) {
               jf $$13 = are.a($$0, new ddp($$5.e + $$8, $$5.f + $$9));
               if ($$13 != null) {
                  $$1.a($$13, 0.0F);
                  break;
               }
            }

            if ($$8 == $$9 || $$8 < 0 && $$8 == -$$9 || $$8 > 0 && $$8 == 1 - $$9) {
               int $$14 = $$10;
               $$10 = -$$11;
               $$11 = $$14;
            }

            $$8 += $$10;
            $$9 += $$11;
         }

         if ($$2) {
            $$0.G_().a(lw.aK).flatMap($$0x -> $$0x.a(rw.m)).ifPresent($$3x -> ((edg)$$3x.a()).a($$0, $$4.g(), $$0.z, $$1.a()));
         }
      }
   }

   private void a(etf $$0) {
      $$0.a(brp.a);
      $$0.d(true);
      ete $$1 = $$0.I();
      $$1.b(false);
      $$1.a(false);
      $$1.a(1000000000);
      $$1.b(6000L);
      $$1.a(deg.d);
   }

   private void b(ars $$0) {
      arj $$1 = this.J();
      l.info("Preparing start region for dimension {}", $$1.ag().a());
      jf $$2 = $$1.W();
      $$0.a(new ddp($$2));
      arh $$3 = $$1.l();
      this.ao = ad.d();
      $$1.a($$2, $$1.X());
      int $$4 = this.aL().c(def.aa);
      int $$5 = $$4 > 0 ? azf.h(ars.a($$4)) : 0;

      while ($$3.b() < $$5) {
         this.ao = ad.d() + t;
         this.v_();
      }

      this.ao = ad.d() + t;
      this.v_();

      for (arj $$6 : this.Q.values()) {
         dee $$7 = $$6.u().b(dee.a(), "chunks");
         if ($$7 != null) {
            LongIterator $$8 = $$7.b().iterator();

            while ($$8.hasNext()) {
               long $$9 = $$8.nextLong();
               ddp $$10 = new ddp($$9);
               $$6.l().a($$10, true);
            }
         }
      }

      this.ao = ad.d() + t;
      this.v_();
      $$0.b();
      this.bJ();
   }

   public deg u_() {
      return this.j.k();
   }

   public boolean j() {
      return this.j.l();
   }

   public abstract int k();

   public abstract int l();

   public abstract boolean m();

   public boolean a(boolean $$0, boolean $$1, boolean $$2) {
      boolean $$3 = false;

      for (arj $$4 : this.L()) {
         if (!$$0) {
            l.info("Saving chunks for level '{}'/{}", $$4, $$4.ag().a());
         }

         $$4.a(null, $$1, $$4.e && !$$2);
         $$3 = true;
      }

      arj $$5 = this.J();
      ete $$6 = this.j.I();
      $$6.a($$5.B_().t());
      this.j.a(this.aM().a(this.bb()));
      this.f.a(this.bb(), this.j, this.ag().r());
      if ($$1) {
         for (arj $$7 : this.L()) {
            l.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", $$7.l().a.n());
         }

         l.info("ThreadedAnvilChunkStorage: All dimensions are saved");
      }

      return $$3;
   }

   public boolean b(boolean $$0, boolean $$1, boolean $$2) {
      boolean var4;
      try {
         this.aH = true;
         this.ag().h();
         var4 = this.a($$0, $$1, $$2);
      } finally {
         this.aH = false;
      }

      return var4;
   }

   @Override
   public void close() {
      this.v();
   }

   public void v() {
      if (this.A.e()) {
         this.aX();
      }

      l.info("Stopping server");
      this.ah().b();
      this.aH = true;
      if (this.R != null) {
         l.info("Saving players");
         this.R.h();
         this.R.s();
      }

      l.info("Saving worlds");

      for (arj $$0 : this.L()) {
         if ($$0 != null) {
            $$0.e = false;
         }
      }

      while (this.Q.values().stream().anyMatch($$0x -> $$0x.l().a.e())) {
         this.ao = ad.d() + bag.b;

         for (arj $$1 : this.L()) {
            $$1.l().o();
            $$1.l().a(() -> true, false);
         }

         this.v_();
      }

      this.a(false, true, false);

      for (arj $$2 : this.L()) {
         if ($$2 != null) {
            try {
               $$2.close();
            } catch (IOException var5) {
               l.error("Exception closing the level", var5);
            }
         }
      }

      this.aH = false;
      this.aB.close();

      try {
         this.f.close();
      } catch (IOException var4) {
         l.error("Failed to unlock level {}", this.f.f(), var4);
      }
   }

   public String w() {
      return this.N;
   }

   public void a_(String $$0) {
      this.N = $$0;
   }

   public boolean x() {
      return this.S;
   }

   public void a(boolean $$0) {
      this.S = false;
      if ($$0) {
         try {
            this.ak.join();
         } catch (InterruptedException var3) {
            l.error("Error while shutting down", var3);
         }
      }
   }

   protected void y() {
      try {
         if (!this.e()) {
            throw new IllegalStateException("Failed to initialize server");
         }

         this.ao = ad.d();
         this.K = this.bE().orElse(null);
         this.J = this.bH();

         while (this.S) {
            long $$0;
            if (!this.E() && this.aD.a() && this.aD.d()) {
               $$0 = 0L;
               this.ao = ad.d();
               this.ai = this.ao;
            } else {
               $$0 = this.aD.h();
               long $$2 = ad.d() - this.ao;
               if ($$2 > o + 20L * $$0 && this.ao - this.ai >= q + 100L * $$0) {
                  long $$3 = $$2 / $$0;
                  l.warn("Can't keep up! Is the server overloaded? Running {}ms or {} ticks behind", $$2 / bag.b, $$3);
                  this.ao += $$3 * $$0;
                  this.ai = this.ao;
               }
            }

            boolean $$4 = $$0 == 0L;
            if (this.G) {
               this.G = false;
               this.F = new MinecraftServer.c(ad.d(), this.U);
            }

            this.ao += $$0;
            this.bK();
            this.B.a("tick");
            this.a($$4 ? () -> false : this::bv);
            this.B.b("nextTickWait");
            this.ar = true;
            this.aq = Math.max(ad.d() + $$0, this.ao);
            this.bt();
            this.v_();
            this.bu();
            if ($$4) {
               this.aD.e();
            }

            this.B.c();
            this.bs();
            this.aT();
            this.ah = true;
            bom.f.a(this.ay);
         }
      } catch (Throwable var46) {
         l.error("Encountered an unexpected exception", var46);
         o $$7 = b(var46);
         this.b($$7.f());
         Path $$8 = this.D().resolve("crash-reports").resolve("crash-" + ad.f() + "-server.txt");
         if ($$7.a($$8, y.a)) {
            l.error("This crash report has been saved to: {}", $$8.toAbsolutePath());
         } else {
            l.error("We were unable to save this crash report to disk.");
         }

         this.a($$7);
      } finally {
         try {
            this.T = true;
            this.v();
         } catch (Throwable var44) {
            l.error("Exception stopping the server", var44);
         } finally {
            if (this.i.f() != null) {
               this.i.f().a();
            }

            this.i();
         }
      }
   }

   private void bs() {
      long $$0 = ad.d();
      if (this.g()) {
         this.f().a($$0 - this.al);
      }

      this.al = $$0;
   }

   private void bt() {
      if (this.g()) {
         this.am = ad.d();
         this.an = 0L;
      }
   }

   private void bu() {
      if (this.g()) {
         bmu $$0 = this.f();
         $$0.a(ad.d() - this.am - this.an, bmw.c.ordinal());
         $$0.a(this.an, bmw.d.ordinal());
      }
   }

   private static o b(Throwable $$0) {
      z $$1 = null;

      for (Throwable $$2 = $$0; $$2 != null; $$2 = $$2.getCause()) {
         if ($$2 instanceof z $$3) {
            $$1 = $$3;
         }
      }

      o $$4;
      if ($$1 != null) {
         $$4 = $$1.a();
         if ($$1 != $$0) {
            $$4.a("Wrapped in").a("Wrapping exception", $$0);
         }
      } else {
         $$4 = new o("Exception in server tick loop", $$0);
      }

      return $$4;
   }

   private boolean bv() {
      return this.bD() || ad.d() < (this.ar ? this.aq : this.ao);
   }

   public static boolean z() {
      RuntimeException $$0 = aI.get();
      if ($$0 != null) {
         throw $$0;
      } else {
         return true;
      }
   }

   public static void a(RuntimeException $$0) {
      aI.compareAndSet(null, $$0);
   }

   @Override
   public void b(BooleanSupplier $$0) {
      super.b(() -> z() && $$0.getAsBoolean());
   }

   protected void v_() {
      this.bC();
      this.ap = true;

      try {
         this.b((BooleanSupplier)(() -> !this.bv()));
      } finally {
         this.ap = false;
      }
   }

   @Override
   public void A() {
      boolean $$0 = this.g();
      long $$1 = $$0 ? ad.d() : 0L;
      long $$2 = this.ap ? this.ao - ad.d() : 100000L;
      LockSupport.parkNanos("waiting for tasks", $$2);
      if ($$0) {
         this.an = this.an + (ad.d() - $$1);
      }
   }

   protected amb a(Runnable $$0) {
      return new amb(this.U, $$0);
   }

   protected boolean a(amb $$0) {
      return $$0.a() + 3 < this.U || this.bv();
   }

   @Override
   public boolean B() {
      boolean $$0 = this.bw();
      this.ar = $$0;
      return $$0;
   }

   private boolean bw() {
      if (super.B()) {
         return true;
      } else {
         if (this.aD.a() || this.bv()) {
            for (arj $$0 : this.L()) {
               if ($$0.l().d()) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   protected void b(amb $$0) {
      this.aS().d("runTask");
      super.d($$0);
   }

   private Optional<akb.a> bE() {
      Optional<Path> $$0 = Optional.of(this.c("server-icon.png"))
         .filter($$0x -> Files.isRegularFile($$0x))
         .or(() -> this.f.j().filter($$0x -> Files.isRegularFile($$0x)));
      return $$0.flatMap($$0x -> {
         try {
            BufferedImage $$1 = ImageIO.read($$0x.toFile());
            Preconditions.checkState($$1.getWidth() == 64, "Must be 64 pixels wide");
            Preconditions.checkState($$1.getHeight() == 64, "Must be 64 pixels high");
            ByteArrayOutputStream $$2 = new ByteArrayOutputStream();
            ImageIO.write($$1, "PNG", $$2);
            return Optional.of(new akb.a($$2.toByteArray()));
         } catch (Exception var3) {
            l.error("Couldn't load server icon", var3);
            return Optional.empty();
         }
      });
   }

   public Optional<Path> C() {
      return this.f.j();
   }

   public Path D() {
      return Path.of("");
   }

   public void a(o $$0) {
   }

   public void i() {
   }

   public boolean E() {
      return false;
   }

   public void a(BooleanSupplier $$0) {
      long $$1 = ad.d();
      int $$2 = this.br() * 20;
      if ($$2 > 0) {
         if (this.R.m() == 0 && !this.aD.a()) {
            this.aG++;
         } else {
            this.aG = 0;
         }

         if (this.aG >= $$2) {
            if (this.aG == $$2) {
               l.info("Server empty for {} seconds, pausing", this.br());
               this.bF();
            }

            this.G();
            return;
         }
      }

      this.U++;
      this.aD.m();
      this.c($$0);
      if ($$1 - this.aj >= s) {
         this.aj = $$1;
         this.J = this.bH();
      }

      this.V--;
      if (this.V <= 0) {
         this.bF();
      }

      this.B.a("tallying");
      long $$3 = ad.d() - $$1;
      int $$4 = this.U % 100;
      this.ad = this.ad - this.ac[$$4];
      this.ad += $$3;
      this.ac[$$4] = $$3;
      this.ay = this.ay * 0.8F + (float)$$3 / (float)bag.b * 0.19999999F;
      this.a($$1);
      this.B.c();
   }

   private void bF() {
      this.V = this.bG();
      l.debug("Autosave started");
      this.B.a("save");
      this.b(true, false, false);
      this.B.c();
      l.debug("Autosave finished");
   }

   private void a(long $$0) {
      if (this.g()) {
         this.f().a(ad.d() - $$0, bmw.b.ordinal());
      }
   }

   private int bG() {
      float $$1;
      if (this.aD.a()) {
         long $$0 = this.aQ() + 1L;
         $$1 = (float)bag.a / (float)$$0;
      } else {
         $$1 = this.aD.f();
      }

      int $$3 = 300;
      return Math.max(100, (int)($$1 * 300.0F));
   }

   public void F() {
      int $$0 = this.bG();
      if ($$0 < this.V) {
         this.V = $$0;
      }
   }

   protected abstract bmu f();

   public abstract boolean g();

   private akb bH() {
      akb.b $$0 = this.bI();
      return new akb(xe.a(this.aa), Optional.of($$0), Optional.of(akb.c.a()), Optional.ofNullable(this.K), this.aA());
   }

   private akb.b bI() {
      List<ark> $$0 = this.R.t();
      int $$1 = this.O();
      if (this.an()) {
         return new akb.b($$1, $$0.size(), List.of());
      } else {
         int $$2 = Math.min($$0.size(), 12);
         ObjectArrayList<GameProfile> $$3 = new ObjectArrayList($$2);
         int $$4 = azf.a(this.L, 0, $$0.size() - $$2);

         for (int $$5 = 0; $$5 < $$2; $$5++) {
            ark $$6 = $$0.get($$4 + $$5);
            $$3.add($$6.ac() ? $$6.gc() : e);
         }

         ad.c($$3, this.L);
         return new akb.b($$1, $$0.size(), $$3);
      }
   }

   protected void c(BooleanSupplier $$0) {
      this.ag().t().forEach($$0x -> $$0x.c.f());
      this.B.a("commandFunctions");
      this.aE().b();
      this.B.b("levels");

      for (arj $$1 : this.L()) {
         this.B.a(() -> $$1 + " " + $$1.ag().a());
         if (this.U % 20 == 0) {
            this.B.a("timeSync");
            this.b($$1);
            this.B.c();
         }

         this.B.a("tick");

         try {
            $$1.a($$0);
         } catch (Throwable var6) {
            o $$3 = o.a(var6, "Exception ticking world");
            $$1.a($$3);
            throw new z($$3);
         }

         this.B.c();
         this.B.c();
      }

      this.B.b("connection");
      this.G();
      this.B.b("players");
      this.R.d();
      if (ab.aW && this.aD.i()) {
         th.a.b();
      }

      this.B.b("server gui refresh");

      for (int $$4 = 0; $$4 < this.z.size(); $$4++) {
         this.z.get($$4).run();
      }

      this.B.b("send chunks");

      for (ark $$5 : this.R.t()) {
         $$5.c.g.a($$5);
         $$5.c.g();
      }

      this.B.c();
   }

   public void G() {
      this.ah().c();
   }

   private void b(arj $$0) {
      this.R.a(new afu($$0.aa(), $$0.ab(), $$0.ac().b(def.l)), $$0.ag());
   }

   public void H() {
      this.B.a("timeSync");

      for (arj $$0 : this.L()) {
         this.b($$0);
      }

      this.B.c();
   }

   public boolean a(dej $$0) {
      return true;
   }

   public void b(Runnable $$0) {
      this.z.add($$0);
   }

   protected void b(String $$0) {
      this.aA = $$0;
   }

   public boolean I() {
      return !this.ak.isAlive();
   }

   public Path c(String $$0) {
      return this.D().resolve($$0);
   }

   public final arj J() {
      return this.Q.get(dej.h);
   }

   @Nullable
   public arj a(ald<dej> $$0) {
      return this.Q.get($$0);
   }

   public Set<ald<dej>> K() {
      return this.Q.keySet();
   }

   public Iterable<arj> L() {
      return this.Q.values();
   }

   @Override
   public String M() {
      return ab.b().c();
   }

   @Override
   public int N() {
      return this.R.m();
   }

   @Override
   public int O() {
      return this.R.n();
   }

   public String[] P() {
      return this.R.e();
   }

   @DontObfuscate
   public String getServerModName() {
      return "vanilla";
   }

   public ac b(ac $$0) {
      $$0.a("Server Running", () -> Boolean.toString(this.S));
      if (this.R != null) {
         $$0.a("Player Count", () -> this.R.m() + " / " + this.R.n() + "; " + this.R.t());
      }

      $$0.a("Active Data Packs", () -> aug.a(this.as.f()));
      $$0.a("Available Data Packs", () -> aug.a(this.as.c()));
      $$0.a("Enabled Feature Flags", () -> cqs.f.b(this.j.K()).stream().map(ale::toString).collect(Collectors.joining(", ")));
      $$0.a("World Generation", () -> this.j.B().toString());
      $$0.a("World Seed", () -> String.valueOf(this.j.y().b()));
      $$0.a("Suppressed Exceptions", this.aJ::a);
      if (this.aA != null) {
         $$0.a("Server Id", () -> this.aA);
      }

      return this.a($$0);
   }

   public abstract ac a(ac var1);

   public aze Q() {
      return aze.a("vanilla", this::getServerModName, "Server", MinecraftServer.class);
   }

   @Override
   public void a(xe $$0) {
      l.info($$0.getString());
   }

   public KeyPair R() {
      return this.ae;
   }

   public int S() {
      return this.O;
   }

   public void a(int $$0) {
      this.O = $$0;
   }

   @Nullable
   public GameProfile T() {
      return this.af;
   }

   public void b(@Nullable GameProfile $$0) {
      this.af = $$0;
   }

   public boolean U() {
      return this.af != null;
   }

   protected void V() {
      l.info("Generating keypair");

      try {
         this.ae = ayd.b();
      } catch (aye var2) {
         throw new IllegalStateException("Failed to generate key pair", var2);
      }
   }

   public void a(brp $$0, boolean $$1) {
      if ($$1 || !this.j.r()) {
         this.j.a(this.j.l() ? brp.d : $$0);
         this.bJ();
         this.ag().t().forEach(this::c);
      }
   }

   public int b(int $$0) {
      return $$0;
   }

   private void bJ() {
      for (arj $$0 : this.L()) {
         $$0.a(this.W());
      }
   }

   public void b(boolean $$0) {
      this.j.d($$0);
      this.ag().t().forEach(this::c);
   }

   private void c(ark $$0) {
      esv $$1 = $$0.dS().z_();
      $$0.c.b(new acn($$1.q(), $$1.r()));
   }

   public boolean W() {
      return this.j.q() != brp.a;
   }

   public boolean X() {
      return this.ag;
   }

   public void c(boolean $$0) {
      this.ag = $$0;
   }

   public Optional<MinecraftServer.b> Y() {
      return Optional.empty();
   }

   public boolean Z() {
      return this.Y().filter(MinecraftServer.b::d).isPresent();
   }

   public abstract boolean n();

   public abstract int o();

   public boolean aa() {
      return this.W;
   }

   public void d(boolean $$0) {
      this.W = $$0;
   }

   public boolean ab() {
      return this.X;
   }

   public void e(boolean $$0) {
      this.X = $$0;
   }

   public abstract boolean p();

   public boolean ac() {
      return this.Y;
   }

   public void f(boolean $$0) {
      this.Y = $$0;
   }

   public boolean ad() {
      return this.Z;
   }

   public void g(boolean $$0) {
      this.Z = $$0;
   }

   public abstract boolean q();

   @Override
   public String ae() {
      return this.aa;
   }

   public void d(String $$0) {
      this.aa = $$0;
   }

   public boolean af() {
      return this.T;
   }

   public avj ag() {
      return this.R;
   }

   public void a(avj $$0) {
      this.R = $$0;
   }

   public abstract boolean r();

   public void a(deg $$0) {
      this.j.a($$0);
   }

   public ask ah() {
      return this.H;
   }

   public boolean ai() {
      return this.ah;
   }

   public boolean aj() {
      return false;
   }

   public boolean a(@Nullable deg $$0, boolean $$1, int $$2) {
      return false;
   }

   public int ak() {
      return this.U;
   }

   public int al() {
      return 16;
   }

   public boolean a(arj $$0, jf $$1, cnx $$2) {
      return false;
   }

   public boolean am() {
      return true;
   }

   public boolean an() {
      return false;
   }

   public Proxy ao() {
      return this.h;
   }

   public int ap() {
      return this.ab;
   }

   public void c(int $$0) {
      this.ab = $$0;
   }

   public MinecraftSessionService aq() {
      return this.i.c();
   }

   @Nullable
   public azs ar() {
      return this.i.a();
   }

   public GameProfileRepository as() {
      return this.i.e();
   }

   @Nullable
   public avf at() {
      return this.i.f();
   }

   @Nullable
   public akb au() {
      return this.J;
   }

   public void av() {
      this.aj = 0L;
   }

   public int aw() {
      return 29999984;
   }

   @Override
   public boolean ax() {
      return super.ax() && !this.af();
   }

   @Override
   public void c(Runnable $$0) {
      if (this.af()) {
         throw new RejectedExecutionException("Server already shutting down");
      } else {
         super.c($$0);
      }
   }

   @Override
   public Thread ay() {
      return this.ak;
   }

   public int az() {
      return 256;
   }

   public boolean aA() {
      return false;
   }

   public long aB() {
      return this.ao;
   }

   public DataFixer aC() {
      return this.M;
   }

   public int a(@Nullable arj $$0) {
      return $$0 != null ? $$0.ac().c(def.s) : 10;
   }

   public alr aD() {
      return this.aB.b.e();
   }

   public alt aE() {
      return this.aw;
   }

   public CompletableFuture<Void> a(Collection<String> $$0) {
      CompletableFuture<Void> $$1 = CompletableFuture.<ImmutableList>supplyAsync(
            () -> $$0.stream().map(this.as::c).filter(Objects::nonNull).map(aud::f).collect(ImmutableList.toImmutableList()), this
         )
         .thenCompose($$0x -> {
            aul $$1x = new auo(atj.b, $$0x);
            List<kb.a<?>> $$2 = axm.a($$1x, this.P.a());
            return alp.a($$1x, this.P, $$2, this.j.K(), this.n() ? ev.a.b : ev.a.c, this.l(), this.az, this).whenComplete(($$1xx, $$2x) -> {
               if ($$2x != null) {
                  $$1x.close();
               }
            }).thenApply($$1xx -> new MinecraftServer.a($$1x, $$1xx));
         })
         .thenAcceptAsync($$1x -> {
            this.aB.close();
            this.aB = $$1x;
            this.as.b($$0);
            dff $$2 = new dff(a(this.as, true), this.j.K());
            this.j.a($$2);
            this.aB.b.g();
            this.aB.b.c().a();
            this.ag().h();
            this.ag().u();
            this.aw.a(this.aB.b.a());
            this.aC.a(this.aB.a);
            this.aF = dss.a(this.P.a(), this.j.K());
         }, this);
      if (this.by()) {
         this.b($$1::isDone);
      }

      return $$1;
   }

   public static dff a(aug $$0, dff $$1, boolean $$2, boolean $$3) {
      ddw $$4 = $$1.a();
      cqq $$5 = $$2 ? cqq.a() : $$1.b();
      cqq $$6 = $$2 ? cqs.f.a() : $$1.b();
      $$0.a();
      if ($$3) {
         return a($$0, List.of("vanilla"), $$5, false);
      } else {
         Set<String> $$7 = Sets.newLinkedHashSet();

         for (String $$8 : $$4.a()) {
            if ($$0.d($$8)) {
               $$7.add($$8);
            } else {
               l.warn("Missing data pack {}", $$8);
            }
         }

         for (aud $$9 : $$0.c()) {
            String $$10 = $$9.g();
            if (!$$4.b().contains($$10)) {
               cqq $$11 = $$9.e();
               boolean $$12 = $$7.contains($$10);
               if (!$$12 && $$9.l().a()) {
                  if ($$11.a($$6)) {
                     l.info("Found new data pack {}, loading it automatically", $$10);
                     $$7.add($$10);
                  } else {
                     l.info("Found new data pack {}, but can't load it due to missing features {}", $$10, cqs.a($$6, $$11));
                  }
               }

               if ($$12 && !$$11.a($$6)) {
                  l.warn("Pack {} requires features {} that are not enabled for this world, disabling pack.", $$10, cqs.a($$6, $$11));
                  $$7.remove($$10);
               }
            }
         }

         if ($$7.isEmpty()) {
            l.info("No datapacks selected, forcing vanilla");
            $$7.add("vanilla");
         }

         return a($$0, $$7, $$5, true);
      }
   }

   private static dff a(aug $$0, Collection<String> $$1, cqq $$2, boolean $$3) {
      $$0.b($$1);
      a($$0, $$2);
      ddw $$4 = a($$0, $$3);
      cqq $$5 = $$0.e().c($$2);
      return new dff($$4, $$5);
   }

   private static void a(aug $$0, cqq $$1) {
      cqq $$2 = $$0.e();
      cqq $$3 = $$1.d($$2);
      if (!$$3.b()) {
         Set<String> $$4 = new ObjectArraySet($$0.d());

         for (aud $$5 : $$0.c()) {
            if ($$3.b()) {
               break;
            }

            if ($$5.l() == auh.d) {
               String $$6 = $$5.g();
               cqq $$7 = $$5.e();
               if (!$$7.b() && $$7.b($$3) && $$7.a($$1)) {
                  if (!$$4.add($$6)) {
                     throw new IllegalStateException("Tried to force '" + $$6 + "', but it was already enabled");
                  }

                  l.info("Found feature pack ('{}') for requested feature, forcing to enabled", $$6);
                  $$3 = $$3.d($$7);
               }
            }
         }

         $$0.b($$4);
      }
   }

   private static ddw a(aug $$0, boolean $$1) {
      Collection<String> $$2 = $$0.d();
      List<String> $$3 = ImmutableList.copyOf($$2);
      List<String> $$4 = $$1 ? $$0.b().stream().filter($$1x -> !$$2.contains($$1x)).toList() : List.of();
      return new ddw($$3, $$4);
   }

   public void a(eu $$0) {
      if (this.aN()) {
         avj $$1 = $$0.l().ag();
         avr $$2 = $$1.i();

         for (ark $$4 : Lists.newArrayList($$1.t())) {
            if (!$$2.a($$4.gc())) {
               $$4.c.a(xe.c("multiplayer.disconnect.not_whitelisted"));
            }
         }
      }
   }

   public aug aF() {
      return this.as;
   }

   public ev aG() {
      return this.aB.b.d();
   }

   public eu aH() {
      arj $$0 = this.J();
      return new eu(this, $$0 == null ? eyw.c : eyw.a($$0.W()), eyv.a, $$0, 4, "Server", xe.b("Server"), this, null);
   }

   @Override
   public boolean l_() {
      return true;
   }

   @Override
   public boolean w_() {
      return true;
   }

   @Override
   public abstract boolean K_();

   public dao aI() {
      return this.aB.b.c();
   }

   public alx aJ() {
      return this.at;
   }

   public esq aK() {
      if (this.au == null) {
         throw new NullPointerException("Called before server init");
      } else {
         return this.au;
      }
   }

   public def aL() {
      return this.J().ac();
   }

   public amh aM() {
      return this.av;
   }

   public boolean aN() {
      return this.ax;
   }

   public void h(boolean $$0) {
      this.ax = $$0;
   }

   public float aO() {
      return this.ay;
   }

   public aly aP() {
      return this.aD;
   }

   public long aQ() {
      return this.ad / (long)Math.min(100, Math.max(this.U, 1));
   }

   public long[] aR() {
      return this.ac;
   }

   public int c(GameProfile $$0) {
      if (this.ag().f($$0)) {
         avl $$1 = this.ag().k().b($$0);
         if ($$1 != null) {
            return $$1.a();
         } else if (this.a($$0)) {
            return 4;
         } else if (this.U()) {
            return this.ag().v() ? 4 : 0;
         } else {
            return this.k();
         }
      } else {
         return 0;
      }
   }

   public bog aS() {
      return this.B;
   }

   public abstract boolean a(GameProfile var1);

   public void a(Path $$0) throws IOException {
   }

   private void b(Path $$0) {
      Path $$1 = $$0.resolve("levels");

      try {
         for (Entry<ald<dej>, arj> $$2 : this.Q.entrySet()) {
            ale $$3 = $$2.getKey().a();
            Path $$4 = $$1.resolve($$3.b()).resolve($$3.a());
            Files.createDirectories($$4);
            $$2.getValue().a($$4);
         }

         this.d($$0.resolve("gamerules.txt"));
         this.e($$0.resolve("classpath.txt"));
         this.c($$0.resolve("stats.txt"));
         this.f($$0.resolve("threads.txt"));
         this.a($$0.resolve("server.properties.txt"));
         this.g($$0.resolve("modules.txt"));
      } catch (IOException var7) {
         l.warn("Failed to save debug report", var7);
      }
   }

   private void c(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         $$1.write(String.format(Locale.ROOT, "pending_tasks: %d\n", this.bz()));
         $$1.write(String.format(Locale.ROOT, "average_tick_time: %f\n", this.aO()));
         $$1.write(String.format(Locale.ROOT, "tick_times: %s\n", Arrays.toString(this.ac)));
         $$1.write(String.format(Locale.ROOT, "queue: %s\n", ad.g()));
      }
   }

   private void d(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         final List<String> $$2 = Lists.newArrayList();
         final def $$3 = this.aL();
         $$3.a(new def.c() {
            @Override
            public <T extends def.g<T>> void a(def.e<T> $$0, def.f<T> $$1) {
               $$2.add(String.format(Locale.ROOT, "%s=%s\n", $$0.a(), $$3.a($$0)));
            }
         });

         for (String $$4 : $$2) {
            $$1.write($$4);
         }
      }
   }

   private void e(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         String $$2 = System.getProperty("java.class.path");
         String $$3 = System.getProperty("path.separator");

         for (String $$4 : Splitter.on($$3).split($$2)) {
            $$1.write($$4);
            $$1.write("\n");
         }
      }
   }

   private void f(Path $$0) throws IOException {
      ThreadMXBean $$1 = ManagementFactory.getThreadMXBean();
      ThreadInfo[] $$2 = $$1.dumpAllThreads(true, true);
      Arrays.sort($$2, Comparator.comparing(ThreadInfo::getThreadName));

      try (Writer $$3 = Files.newBufferedWriter($$0)) {
         for (ThreadInfo $$4 : $$2) {
            $$3.write($$4.toString());
            $$3.write(10);
         }
      }
   }

   private void g(Path $$0) throws IOException {
      try (Writer $$1 = Files.newBufferedWriter($$0)) {
         List<azg.a> $$2;
         try {
            $$2 = Lists.newArrayList(azg.a());
         } catch (Throwable var7) {
            l.warn("Failed to list native modules", var7);
            return;
         }

         $$2.sort(Comparator.comparing($$0x -> $$0x.a));

         for (azg.a $$5 : $$2) {
            $$1.write($$5.toString());
            $$1.write(10);
         }
      }
   }

   private void bK() {
      if (this.E) {
         this.A = bps.a(new bpw(ad.c, this.n()), ad.c, ad.h(), new bpy("server"), this.C, $$0 -> {
            this.h(() -> this.b($$0.resolve("server")));
            this.D.accept($$0);
         });
         this.E = false;
      }

      this.B = boj.a(this.A.f(), boj.a("Server"));
      this.A.c();
      this.B.a();
   }

   public void aT() {
      this.B.b();
      this.A.d();
   }

   public boolean aU() {
      return this.A.e();
   }

   public void a(Consumer<bof> $$0, Consumer<Path> $$1) {
      this.C = $$1x -> {
         this.aV();
         $$0.accept($$1x);
      };
      this.D = $$1;
      this.E = true;
   }

   public void aV() {
      this.A = bpt.a;
   }

   public void aW() {
      this.A.a();
   }

   public void aX() {
      this.A.b();
      this.B = this.A.f();
   }

   public Path a(esx $$0) {
      return this.f.a($$0);
   }

   public boolean aY() {
      return true;
   }

   public epj aZ() {
      return this.aC;
   }

   public etf ba() {
      return this.j;
   }

   public kc.b bb() {
      return this.P.a();
   }

   public jv<aln> bc() {
      return this.P;
   }

   public alo.a bd() {
      return this.aB.b.b();
   }

   public asr a(ark $$0) {
      return asr.e;
   }

   public arl b(ark $$0) {
      return (arl)(this.X() ? new aqx($$0) : new arl($$0));
   }

   @Nullable
   public deg be() {
      return null;
   }

   public auv bf() {
      return this.aB.a;
   }

   public boolean bg() {
      return this.aH;
   }

   public boolean bh() {
      return this.G || this.F != null;
   }

   public void bi() {
      this.G = true;
   }

   public bof bj() {
      if (this.F == null) {
         return bob.a;
      } else {
         bof $$0 = this.F.a(ad.d(), this.U);
         this.F = null;
         return $$0;
      }
   }

   public int bk() {
      return 1000000;
   }

   public void a(xe $$0, xa.a $$1, @Nullable String $$2) {
      String $$3 = $$1.a($$0).getString();
      if ($$2 != null) {
         l.info("[{}] {}", $$2, $$3);
      } else {
         l.info("{}", $$3);
      }
   }

   public wz bl() {
      return wz.a;
   }

   public boolean bm() {
      return true;
   }

   public void a(ark $$0, bms $$1) {
   }

   public boolean bn() {
      return false;
   }

   private void a(o $$0, ddp $$1, dyh $$2) {
      ad.h().execute(() -> {
         try {
            Path $$3 = this.c("debug");
            v.c($$3);
            String $$4 = v.a($$2.a());
            Path $$5 = $$3.resolve("chunk-" + $$4 + "-" + ad.f() + "-server.txt");
            FileStore $$6 = Files.getFileStore($$3);
            long $$7 = $$6.getUsableSpace();
            if ($$7 < 8192L) {
               l.warn("Not storing chunk IO report due to low space on drive {}", $$6.name());
               return;
            }

            p $$8 = $$0.a("Chunk Info");
            $$8.a("Level", $$2::a);
            $$8.a("Dimension", () -> $$2.b().a().toString());
            $$8.a("Storage", $$2::c);
            $$8.a("Position", $$1::toString);
            $$0.a($$5, y.e);
            l.info("Saved details to {}", $$0.e());
         } catch (Exception var11) {
            l.warn("Failed to store chunk IO exception", var11);
         }
      });
   }

   @Override
   public void a(Throwable $$0, dyh $$1, ddp $$2) {
      l.error("Failed to load chunk {},{}", new Object[]{$$2.e, $$2.f, $$0});
      this.aJ.a("chunk/load", $$0);
      this.a(o.a($$0, "Chunk load failure"), $$2, $$1);
   }

   @Override
   public void b(Throwable $$0, dyh $$1, ddp $$2) {
      l.error("Failed to save chunk {},{}", new Object[]{$$2.e, $$2.f, $$0});
      this.aJ.a("chunk/save", $$0);
      this.a(o.a($$0, "Chunk save failure"), $$2, $$1);
   }

   public void a(Throwable $$0, zn<?> $$1) {
      this.aJ.a("packet/" + $$1.toString(), $$0);
   }

   public cxq bo() {
      return this.aE;
   }

   public dss bp() {
      return this.aF;
   }

   public alw bq() {
      return alw.a;
   }

   protected int br() {
      return 0;
   }

   static record a(aul a, alp b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.close();
      }
   }

   public static record b(UUID a, String b, String c, boolean d, @Nullable xe e) {
   }

   static class c {
      final long a;
      final int b;

      c(long $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      bof a(final long $$0, final int $$1) {
         return new bof() {
            @Override
            public List<boi> a(String $$0x) {
               return Collections.emptyList();
            }

            @Override
            public boolean a(Path $$0x) {
               return false;
            }

            @Override
            public long a() {
               return c.this.a;
            }

            @Override
            public int b() {
               return c.this.b;
            }

            @Override
            public long c() {
               return $$0;
            }

            @Override
            public int d() {
               return $$1;
            }

            @Override
            public String e() {
               return "";
            }
         };
      }
   }
}
