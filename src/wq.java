import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record wq(wr l, wr m) {
   public static final Codec<wq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(wr.a.fieldOf("chat").forGetter(wq::a), wr.a.fieldOf("narration").forGetter(wq::b)).apply($$0, wq::new)
   );
   public static final ys<wf, wq> b = ys.a(wr.b, wq::a, wr.b, wq::b, wq::new);
   public static final ys<wf, jj<wq>> c = yq.a(lr.aF, b);
   public static final wr d = wr.a("chat.type.text");
   public static final akj<wq> e = a("chat");
   public static final akj<wq> f = a("say_command");
   public static final akj<wq> g = a("msg_command_incoming");
   public static final akj<wq> h = a("msg_command_outgoing");
   public static final akj<wq> i = a("team_msg_command_incoming");
   public static final akj<wq> j = a("team_msg_command_outgoing");
   public static final akj<wq> k = a("emote_command");

   private static akj<wq> a(String $$0) {
      return akj.a(lr.aF, new akk($$0));
   }

   public static void a(qm<wq> $$0) {
      $$0.a(e, new wq(d, wr.a("chat.type.text.narrate")));
      $$0.a(f, new wq(wr.a("chat.type.announcement"), wr.a("chat.type.text.narrate")));
      $$0.a(g, new wq(wr.b("commands.message.display.incoming"), wr.a("chat.type.text.narrate")));
      $$0.a(h, new wq(wr.c("commands.message.display.outgoing"), wr.a("chat.type.text.narrate")));
      $$0.a(i, new wq(wr.d("chat.type.team.text"), wr.a("chat.type.text.narrate")));
      $$0.a(j, new wq(wr.d("chat.type.team.sent"), wr.a("chat.type.text.narrate")));
      $$0.a(k, new wq(wr.a("chat.type.emote"), wr.a("chat.type.emote")));
   }

   public static wq.a a(akj<wq> $$0, bsh $$1) {
      return a($$0, $$1.dR().H_(), $$1.O_());
   }

   public static wq.a a(akj<wq> $$0, eq $$1) {
      return a($$0, $$1.v(), $$1.b());
   }

   public static wq.a a(akj<wq> $$0, jx $$1, wu $$2) {
      jw<wq> $$3 = $$1.d(lr.aF);
      return new wq.a($$3.g($$0), $$2);
   }

   public wr a() {
      return this.l;
   }

   public wr b() {
      return this.m;
   }

   public static record a(jj<wq> b, wu c, Optional<wu> d) {
      public static final ys<wf, wq.a> a = ys.a(wq.c, wq.a::a, ww.d, wq.a::b, ww.e, wq.a::c, wq.a::new);

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
