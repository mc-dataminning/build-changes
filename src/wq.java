import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record wq(wr j, wr k) {
   public static final Codec<wq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(wr.a.fieldOf("chat").forGetter(wq::a), wr.a.fieldOf("narration").forGetter(wq::b)).apply($$0, wq::new)
   );
   public static final wr b = wr.a("chat.type.text");
   public static final akj<wq> c = a("chat");
   public static final akj<wq> d = a("say_command");
   public static final akj<wq> e = a("msg_command_incoming");
   public static final akj<wq> f = a("msg_command_outgoing");
   public static final akj<wq> g = a("team_msg_command_incoming");
   public static final akj<wq> h = a("team_msg_command_outgoing");
   public static final akj<wq> i = a("emote_command");

   private static akj<wq> a(String $$0) {
      return akj.a(lr.aF, new akk($$0));
   }

   public static void a(qm<wq> $$0) {
      $$0.a(c, new wq(b, wr.a("chat.type.text.narrate")));
      $$0.a(d, new wq(wr.a("chat.type.announcement"), wr.a("chat.type.text.narrate")));
      $$0.a(e, new wq(wr.b("commands.message.display.incoming"), wr.a("chat.type.text.narrate")));
      $$0.a(f, new wq(wr.c("commands.message.display.outgoing"), wr.a("chat.type.text.narrate")));
      $$0.a(g, new wq(wr.d("chat.type.team.text"), wr.a("chat.type.text.narrate")));
      $$0.a(h, new wq(wr.d("chat.type.team.sent"), wr.a("chat.type.text.narrate")));
      $$0.a(i, new wq(wr.a("chat.type.emote"), wr.a("chat.type.emote")));
   }

   public static wq.a a(akj<wq> $$0, bsg $$1) {
      return a($$0, $$1.dQ().H_(), $$1.O_());
   }

   public static wq.a a(akj<wq> $$0, eq $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static wq.a a(akj<wq> $$0, jx $$1, wu $$2) {
      jw<wq> $$3 = $$1.d(lr.aF);
      return new wq.a($$3.g($$0), $$2);
   }

   public wr a() {
      return this.j;
   }

   public wr b() {
      return this.k;
   }

   public static record a(jj<wq> b, wu c, Optional<wu> d) {
      public static final ys<wf, wq.a> a = ys.a(yq.b(lr.aF), wq.a::a, ww.d, wq.a::b, ww.e, wq.a::c, wq.a::new);

      a(jj<wq> $$0, wu $$1) {
         this($$0, $$1, Optional.empty());
      }

      public wu a(wu $$0) {
         return this.b.a().a().a($$0, this);
      }

      public wu b(wu $$0) {
         return this.b.a().b().a($$0, this);
      }

      public wq.a c(wu $$0) {
         return new wq.a(this.b, this.c, Optional.of($$0));
      }

      public jj<wq> a() {
         return this.b;
      }

      public wu b() {
         return this.c;
      }

      public Optional<wu> c() {
         return this.d;
      }
   }
}
